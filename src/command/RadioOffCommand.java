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

public class RadioOffCommand implements Command {
    Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        radio.off();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        radio.off(imageView);
    }
}
