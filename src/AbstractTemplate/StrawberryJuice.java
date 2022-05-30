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
public class StrawberryJuice extends DrinkFactory{

    @Override
    public Base createBase() {
        return new Milk();
    }

    @Override
    public Syrup createSyrup() {
        return new StrawberrySyrup();
    }

    @Override
    public Topping createTopping() {
        return new StrawberrySlice();
    }

    @Override
    public Image setImage(ImageView imageView) {
        return new StrawberryJuiceImage();
    }
    
}
