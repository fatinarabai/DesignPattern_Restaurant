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
public class FryEgg extends SideDishDecarator {

    public FryEgg(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " , FryEgg";
    }

    @Override
    public double getCalory() {
        return 85.0 + food.getCalory();
    }

    @Override
    public void setImage(ImageView imageView) {
        imageView.setVisible(true);
    }
    
}
