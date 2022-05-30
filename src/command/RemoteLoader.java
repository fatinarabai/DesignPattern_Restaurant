package command;

import javafx.scene.image.ImageView;

public class RemoteLoader {

    
    public static void init(int slot, ImageView image) {
        RemoteControl remote = new RemoteControl();
        
        Light light = new Light();
        Radio radio = new Radio();
        Aircond aircond = new Aircond();
        
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command radioOn = new RadioOnCommand(radio);
        Command radioOff = new RadioOffCommand(radio);
        Command aircondOn = new AircondOnCommand(aircond);
        Command aircondOff = new AircondOffCommand(aircond);

        remote.setCommand(0,light.getStatus() ? lightOff : lightOn);
        remote.setCommand(1,radio.getStatus() ? radioOff : radioOn);
        remote.setCommand(2,aircond.getStatus() ? aircondOff : aircondOn);
        
        remote.buttonPressed(slot, image);
    }
}
