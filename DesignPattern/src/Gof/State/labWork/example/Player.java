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
import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private boolean playing = false;
    private TrackIterator trackIterator;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);

        List<String> playlist = new ArrayList<>();
        for (int i = 1; i <= 12; i++) {
            playlist.add("Track " + i);
        }

        this.trackIterator = new TrackIterator(playlist);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public boolean isPlaying() {
        return playing;
    }

    public String startPlayback() {
        return "Playing " + trackIterator.getCurrentTrack();
    }

    public String nextTrack() {
        return "Playing " + trackIterator.nextTrack();
    }

    public String previousTrack() {
        return "Playing " + trackIterator.previousTrack();
    }

    public void setCurrentTrackAfterStop() {
        trackIterator.reset();
    }
}
