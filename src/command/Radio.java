/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command;

/**
 *
 * @author Fatimah
 */
import javafx.scene.image.ImageView;

public class Radio {
    private static Boolean status = false;
    private static RadioAudio radioAudio = new RadioAudio();

    public void on() {
        status = true;
        System.out.println("The radio is turned on.");

        radioAudio.play();
    }

    public void off() {
        status = false;
        System.out.println("The radio is turned off.");

        radioAudio.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("The radio is turned on");

        imageView.setVisible(true);

        radioAudio.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("The radio is turned off");

        imageView.setVisible(false);

        radioAudio.stop();
    }

    public Boolean getStatus() {
        return status;
    }
}
