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
public class CaramelCoffee extends DrinkFactory{

    @Override
    public Base createBase() {
        return new Coffee();
    }

    @Override
    public Syrup createSyrup() {
        return new CaramelSyrup();
    }

    @Override
    public Topping createTopping() {
        return new WhipCream();
    }

    @Override
    public Image setImage(ImageView imageView) {
        return new CaramelCoffeeImage();
    }
    
}
