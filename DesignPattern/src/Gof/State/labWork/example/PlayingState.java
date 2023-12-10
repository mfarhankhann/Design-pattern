/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gof.State.labWork.example;

/**
 *
 * @author fa20-bse-069
 */
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PlayingState extends State {
    private ScheduledExecutorService executor;

    PlayingState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        stopPlayback();
        player.changeState(new LockedState(player));
        player.setCurrentTrackAfterStop();
        return "Stop playing";
    }

    @Override
    public String onPlay() {
        stopPlayback();
        player.changeState(new ReadyState(player));
        return "Paused...";
    }

    @Override
    public String onNext() {
        stopPlayback();
        return player.nextTrack();
    }

    @Override
    public String onPrevious() {
        stopPlayback();
        return player.previousTrack();
    }

    private void stopPlayback() {
        player.stopPlayback();

        if (executor != null) {
            try {
                executor.shutdown();
                if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    executor.shutdownNow();
                }
            } catch (InterruptedException e) {
                // Handle interruption if necessary
                Thread.currentThread().interrupt();
            } finally {
                executor = null;
            }
        }
    }

    public void startPlaybackTimer() {
        executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> {
            stopPlayback();
            // Alert the user to reset the player
            System.out.println("Playback stopped. Please reset the player.");
        }, 3, TimeUnit.SECONDS); // 3 seconds
    }
}


