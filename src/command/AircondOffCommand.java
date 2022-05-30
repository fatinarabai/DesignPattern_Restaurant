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

public class AircondOffCommand implements Command {
    Aircond aircond;

    public AircondOffCommand(Aircond aircond) {
        this.aircond = aircond;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        aircond.off();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        aircond.off(imageView);
    }
}
