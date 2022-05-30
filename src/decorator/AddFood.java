/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator;

import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 *
 * @author User
 */
public class AddFood {
   
    public static void initMainFood(Food food, Text txt, Button noodle, Button rice, Button fryEgg, Button soup, Button fish, Button vegies, Button clearFood) {
        txt.setVisible(true);
        txt.setText("Calories Food: " +String.valueOf(food.getCalory()));
        txt.setFill(Color.WHITE);
        noodle.setDisable(true);        
        rice.setDisable(true);
        fryEgg.setDisable(false);
        soup.setDisable(false);
        fish.setDisable(false);
        vegies.setDisable(false);
        clearFood.setDisable(false);
    }
    
    public static void initSideDish(Food food, Text txt) {
        txt.setText("Calories Food: " +String.valueOf(food.getCalory()));
        txt.setFill(Color.WHITE);
    }
    public static void clearFood(Text txt, Button noodle, Button rice, Button fryEgg, Button soup, Button fish, Button vegies, Button clearFood){
        txt.setVisible(false);
        noodle.setDisable(false);
        rice.setDisable(false);
        fryEgg.setDisable(true);
        soup.setDisable(true);
        fish.setDisable(true);
        vegies.setDisable(true);
        clearFood.setDisable(true);
    }
}
