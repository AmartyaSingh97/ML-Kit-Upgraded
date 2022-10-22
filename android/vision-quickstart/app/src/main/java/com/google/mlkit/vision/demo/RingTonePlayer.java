package com.google.mlkit.vision.demo;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.ToneGenerator;

import java.io.IOException;

public class RingTonePlayer {
    public static final ToneGenerator tg = new ToneGenerator(AudioManager.STREAM_NOTIFICATION, 100);
    public static MediaPlayer mediaPlayer = new MediaPlayer();

    public static void playAudio(){
//        String audioUrl = "https://www.soundjay.com/buttons/sounds/beep-08b.mp3";
//        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
//        try {
//            mediaPlayer.setDataSource(audioUrl);
//            mediaPlayer.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        tg.startTone(ToneGenerator.TONE_PROP_BEEP);
    }
    public static void stopAudio(){
//        if(mediaPlayer.isPlaying()){
//            mediaPlayer.stop();
//        }
        tg.stopTone();
    }
}
