/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractTemplate;

import javafx.scene.image.ImageView;

/**
 *
 * @author User
 */
public class CaramelCoffeeImage implements Image{

    public CaramelCoffeeImage(){}
    @Override
    public void setImage(ImageView imageView) {
        if (!imageView.isVisible()) {
                    imageView.setVisible(true);  
                    System.out.println("Caramel Coffee addded to order");
                }else{
                    imageView.setVisible(false);
        }
    }
    
}
