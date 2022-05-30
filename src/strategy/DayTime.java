/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javafx.scene.image.ImageView;

/**
 *
 * @author nurul
 */
public class DayTime implements TimeBehavior {
    @Override
    public void time(ImageView day, ImageView night) {
        System.out.println("Current is daylight");
        day.setVisible(true);
        night.setVisible(false);
    }
}
