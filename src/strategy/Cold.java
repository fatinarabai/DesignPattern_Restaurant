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
public class Cold implements TemperatureBehavior {

    @Override
    public void temp(Text tempText) {
        System.out.println("Current temperature is cold");
        tempText.setText("24°C");
        tempText.setFill(Color.BLUE);
    }
    
}
