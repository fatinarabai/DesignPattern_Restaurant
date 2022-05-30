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
public class Vegies extends SideDishDecarator {

    public Vegies(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " , Vegies"; 
    }

    @Override
    public double getCalory() {
        return 65.0 + food.getCalory();
    }

    @Override
    public void setImage(ImageView imageView) {
       imageView.setVisible(true);
    }
    
}
