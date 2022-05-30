package command;


import javafx.scene.image.ImageView;

public class Light {
    private static Boolean status = false;
//    private static SantaAudio santaAudio = new SantaAudio();

    public void on() {
        status = true;
        System.out.println("The light is turned on.");

//        santaAudio.play();
    }

    public void off() {
        status = false;
        System.out.println("The light is turned off.");

//        santaAudio.stop();
    }

    public void on(ImageView imageView) {
        status = true;
        System.out.println("The light is turned on");

        imageView.setVisible(true);

//        santaAudio.play();
    }

    public void off(ImageView imageView) {
        status = false;
        System.out.println("The light is turned off");

        imageView.setVisible(false);

//        santaAudio.stop();
    }

    public Boolean getStatus() {
        return status;
    }
}
