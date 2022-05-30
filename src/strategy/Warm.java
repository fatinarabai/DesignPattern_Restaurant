/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 *
 * @author nurul
 */
public class Warm implements TemperatureBehavior {

    @Override
    public void temp(Text tempText) {
        System.out.println("Current temperature is warm");
        tempText.setText("34°C");
        tempText.setFill(Color.RED);
    }
    
}
