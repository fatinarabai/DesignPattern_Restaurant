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

public class AircondOnCommand implements Command {
    Aircond aircond;

    public AircondOnCommand(Aircond aircond) {
        this.aircond = aircond;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        aircond.on();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        aircond.on(imageView);
    }
}
