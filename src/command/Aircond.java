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

public class Aircond {
    private static Boolean status = false;
    private static AircondAudio aircondAudio = new AircondAudio();

    public void on() {
        status = true;
        System.out.println("The air conditioner is turned on.");

        aircondAudio.play();
    }

    public void off() {
        status = false;
        System.out.println("The air conditioner is turned off.");

        aircondAudio.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("The air conditioner is turned on");

        imageView.setVisible(true);

        aircondAudio.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("The air conditioner is turned off");

        imageView.setVisible(false);

        aircondAudio.stop();
    }

    public Boolean getStatus() {
        return status;
    }
}
