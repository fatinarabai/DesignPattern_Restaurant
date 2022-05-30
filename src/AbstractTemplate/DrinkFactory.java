/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AbstractTemplate;

import javafx.scene.image.ImageView;

/**
 *
 * @author HP
 */
abstract class DrinkFactory {
    
    public final void createDrink(ImageView imageView){
        Base b = createBase();
        b.setBase();
        Syrup s = createSyrup();
        s.setSyrup();
        Topping t= createTopping();
        t.setToping();
        Image i = setImage(imageView);
        i.setImage(imageView);
    }
    
    public final void removeDrink(String drink,ImageView imageView ){
        System.out.println("Removing "+ drink);
        imageView.setVisible(false);
    }
    
    public abstract Base createBase();
    public abstract Syrup createSyrup();
    public abstract Topping createTopping();
    public abstract Image setImage(ImageView imageView);
    
}
