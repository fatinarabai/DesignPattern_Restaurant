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
public abstract class Food {
    String description = "Uknown Beverage";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double getCalory();
    
    public abstract void setImage(ImageView imageView);
}
