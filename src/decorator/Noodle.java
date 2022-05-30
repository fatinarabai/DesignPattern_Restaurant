/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import javafx.scene.image.ImageView;

/**
 *
 * @author User
 */
public class Noodle extends Food {

    public Noodle(){
        description = "Noodle";
    }
    @Override
    public double getCalory() {
        return 138.00;
    }

    @Override
    public void setImage(ImageView imageView) {
        imageView.setVisible(true);
    }
    
}
