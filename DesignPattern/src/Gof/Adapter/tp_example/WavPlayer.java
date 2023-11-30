/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gof.Adapter.tp_example;

/**
 *
 * @author OSL
 */
public class WavPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        // do nothing
    }

    @Override
    public void playFlac(String fileName) {
        // do nothing
    }

    @Override
    public void playWav(String fileName) {
        System.out.println("Playing wav file. Name: " + fileName);
    }
}