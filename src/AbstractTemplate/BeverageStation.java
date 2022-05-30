/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractTemplate;

import java.util.Scanner;
import javafx.scene.image.ImageView;

/**
 *
 * @author HP
 */
public class BeverageStation {
    public static void init(ImageView imageView, int indicator){
        DrinkFactory SJ = new StrawberryJuice();
        DrinkFactory CC = new CaramelCoffee();
        DrinkFactory LT = new LemonTea();
        DrinkFactory BT = new BubbleTea();
       
        if(indicator == 1)
        {
            if (!imageView.isVisible()) 
            {
                SJ.createDrink(imageView); 
            }
            else
            {
                SJ.removeDrink("Strawberry Juice", imageView);
            }
            
        }
        else if(indicator == 2)
        {
            if (!imageView.isVisible()) 
            {
                CC.createDrink(imageView); 
            }
            else
            {
                CC.removeDrink("Caramel Coffee", imageView);
            }
        }
        else if(indicator == 3)
        {
            if (!imageView.isVisible()) 
            {
                LT.createDrink(imageView); 
            }
            else
            {
                LT.removeDrink("Lemon Tea", imageView);
            }
        }
        else
        {
            if (!imageView.isVisible()) 
            {
                BT.createDrink(imageView); 
            }
            else
            {
                BT.removeDrink("Bubble Tea", imageView);
            }
        }

    }
}
