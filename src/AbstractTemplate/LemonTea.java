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
public class LemonTea extends DrinkFactory {

    @Override
    public Base createBase() {
        return new Tea();
    }

    @Override
    public Syrup createSyrup() {
        return new SugarSyrup();
    }

    @Override
    public Topping createTopping() {
        return new LemonSlice();
    }

    @Override
    public Image setImage(ImageView imageView) {
        return new LemonTeaImage();
    }
    
}
