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

public class RadioOnCommand implements Command {
    Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        radio.on();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        radio.on(imageView);
    }
}
