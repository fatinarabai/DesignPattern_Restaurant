package command;

import javafx.scene.image.ImageView;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Display Santa Claus on the GUI
        light.on();
    }

    @Override
    public void execute(ImageView imageView) {
        // Display Santa Claus on the GUI
        light.on(imageView);
    }
}
