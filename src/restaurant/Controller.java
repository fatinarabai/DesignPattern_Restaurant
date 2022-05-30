/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import AbstractTemplate.BeverageStation;
import command.RemoteLoader;
import decorator.AddFood;
import decorator.Fish;
import decorator.Food;
import decorator.FryEgg;
import decorator.Noodle;
import decorator.Rice;
import decorator.Soup;
import decorator.Vegies;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import strategy.ScenerySetting;

/**
 *
 * @author nurul
 */
public class Controller {

    @FXML
    private ImageView DayBackground, NightBackground;
    
    @FXML
    private ImageView sceneImage, lightImage, radioImage, aircondImage;
    
    @FXML
    private Text temperature;
    
    @FXML
    private RadioButton StrawberryBtn, CaramelBtn, LemonBtn, BubbleBtn;
    
    @FXML
    private ImageView strawberryJuice, caramelCoffee, lemonTea, bubbleTea;
    
    Food food;

    @FXML
    private Button rices , noodles, fryEggs, soups, fishs, vegies, clearFood;

    @FXML
    private ImageView riceBowl, noodleBowl;
    
    @FXML
    private ImageView fryEggImage, soupImage, vegiesImage, fishImage;
     @FXML
    private Text caloryFood;
    
    @FXML
    public void onClick(MouseEvent mouseEvent){
        Button temp = (Button) mouseEvent.getSource();
        String id = temp.getId();
        switch ( id ) {
            // TODO: Strategy Pattern
            case "scene":
                ScenerySetting.init(DayBackground, NightBackground, temperature);
                break;
            
            // TODO: Command Pattern    
            case "light":
                RemoteLoader.init(0, lightImage);
                break;
            case "radio":
                RemoteLoader.init(1, radioImage);
                break;
            case "aircond":
                RemoteLoader.init(2, aircondImage);
                break;
                
            // TODO: Decarator Pattern
            case "rices":
                food = new Rice();
                food.setImage(riceBowl);
                System.out.println("Description:" +food.getDescription());
                System.out.println("Calory: " +food.getCalory());
                AddFood.initMainFood(food,caloryFood,noodles,rices,fryEggs,soups,fishs,vegies,clearFood);
                break;
            case "noodles":
                food = new Noodle();
                food.setImage(noodleBowl);
                System.out.println("Description:" +food.getDescription());
                System.out.println("Calory: " +food.getCalory());
                AddFood.initMainFood(food,caloryFood,noodles,rices,fryEggs,soups,fishs,vegies,clearFood);
                break;
            case "fryEggs":
                food = new FryEgg(food);
                food.setImage(fryEggImage);
                System.out.println(food.getDescription());                    
                System.out.println(food.getCalory());
                AddFood.initSideDish(food, caloryFood);
                break;
            case "soups":
                food = new Soup(food);
                food.setImage(soupImage);
                System.out.println(food.getDescription());                    
                System.out.println(food.getCalory());
                AddFood.initSideDish(food, caloryFood);
                break;
            case "fishs":
                food = new Fish(food);
                food.setImage(fishImage);
                System.out.println(food.getDescription());                    
                System.out.println(food.getCalory());
                AddFood.initSideDish(food, caloryFood);
                break;
            case "vegies":
                food = new Vegies(food);
                food.setImage(vegiesImage);
                System.out.println(food.getDescription());                    
                System.out.println(food.getCalory());
                AddFood.initSideDish(food, caloryFood);
                break;
        }
        
    }
    
    @FXML
    public void addDrinks(ActionEvent e){
        RadioButton btn = (RadioButton) e.getSource();
        String id = btn.getId();
        switch(id){
            case "StrawberryBtn":
                BeverageStation.init(strawberryJuice, 1);
                break;

            case "CaramelBtn":
                BeverageStation.init(caramelCoffee, 2);
                break;
                
            case "LemonBtn":
                BeverageStation.init(lemonTea, 3);
                break;
                
            case "BubbleBtn":
                BeverageStation.init(bubbleTea, 4);
                break;
        }
    }
    
    @FXML
    public void clearFood(ActionEvent e){
        AddFood.clearFood(caloryFood, noodles, rices, fryEggs, soups, fishs, vegies, clearFood);
        riceBowl.setVisible(false);
        noodleBowl.setVisible(false);
        fishImage.setVisible(false);
        soupImage.setVisible(false);
        vegiesImage.setVisible(false);
        fryEggImage.setVisible(false);
        food = null;
    }
    
}
