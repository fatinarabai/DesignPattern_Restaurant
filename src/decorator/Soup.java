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
public class Soup extends SideDishDecarator{

    public Soup(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
       return food.getDescription() + " , Soup";
    }

    @Override
    public double getCalory() {
        return 46.0 + food.getCalory();
    }

    @Override
    public void setImage(ImageView imageView) {
        imageView.setVisible(true);
    }
    
}
