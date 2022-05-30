package command;

import javafx.scene.image.ImageView;

public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        // Hide santa from the GUI
        light.off();
    }

    @Override
    public void execute(ImageView imageView) {
        // Hide santa from the GUI
        light.off(imageView);
    }
}
