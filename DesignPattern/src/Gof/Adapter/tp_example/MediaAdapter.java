/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Adapter.tp_example;

/**
 *
 * @author OSL
 */
public class MediaAdapter implements MediaPlayer {
   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
   
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();			
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      } else if (audioType.equalsIgnoreCase("wav")) {
         advancedMusicPlayer = new WavPlayer();
      } else if (audioType.equalsIgnoreCase("flac")) {
         advancedMusicPlayer = new FlacPlayer();
      }
   }

   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }
      else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
      else if(audioType.equalsIgnoreCase("wav")){
         advancedMusicPlayer.playWav(fileName);
      }
      else if(audioType.equalsIgnoreCase("flac")){
         advancedMusicPlayer.playFlac(fileName);
      }
   }
}
