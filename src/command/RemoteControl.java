package command;

import javafx.scene.image.ImageView;

public class RemoteControl {
//    Command slot;
//    Command[] onCommands, offCommands;
    Command[] commands;

    public RemoteControl() {
        
        commands = new Command[3];
//        offCommands = new Command[3];
        
        Command noCommand = new NoCommand();
        for(int i=0; i<3; i++){
            commands[i] = noCommand;
//            offCommands[i] = noCommand;
        }
    }

//    public void setCommand(Command command) {
//        slot = command;
//    }
    
    public void setCommand(int slot, Command command) {
        commands[slot] = command;
//        offCommands[slot] = offCommand;
    }

//    public void buttonPressed() {
//        slot.execute();
//    }
    
    public void buttonPressed(int slot) {
        commands[slot].execute();
    }

//    public void buttonPressed(ImageView imageView) {
//        slot.execute(imageView);
//    }
    
    public void buttonPressed(int slot, ImageView imageView) {
        commands[slot].execute(imageView);
    }
}
