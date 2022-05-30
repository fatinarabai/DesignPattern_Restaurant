/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractTemplate;

import javafx.scene.image.ImageView;

/**
 *
 * @author HP
 */
public class BubbleTea extends DrinkFactory{

    @Override
    public Base createBase() {
        return new MilkTea();
    }

    @Override
    public Syrup createSyrup() {
        return new BrownSugarSyrup();
    }

    @Override
    public Topping createTopping() {
        return new Pearl();
    }

    @Override
    public Image setImage(ImageView imageView) {
        return new BubbleTeaImage();
    }
    
}
