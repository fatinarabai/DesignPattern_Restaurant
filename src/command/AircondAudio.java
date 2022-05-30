/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author Fatimah
 */
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

public class AircondAudio {
    private static Boolean loop = false;
    private static final String path = "./src/res/aircond_audio.mp3";
    private static final Media media = new Media(new File(path).toURI().toString());
    private static final MediaPlayer audio = new MediaPlayer(media);

    public AircondAudio() {
    }

    public static void play() {
        if ( loop ) {
            audio.setOnEndOfMedia(new Runnable() {
                @Override
                public void run() {
                    audio.seek(Duration.ZERO);
                }
            });
        }

        audio.play();
    }

    public static void stop() {
        audio.stop();
    }
}
