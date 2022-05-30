/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 *
 * @author nurul
 */
public abstract class Scenery {
    private static Boolean status = false;
    TimeBehavior timeBehavior;
    TemperatureBehavior tempBehavior;
    
    public Scenery(){
        
    }
    
    public abstract void display();
    
    public static Boolean getStatus() {
        return status;
    }
    
    public void setStatus(Boolean status){
        this.status = status;
    }
    
    public void performTime(ImageView day, ImageView night){
        
        timeBehavior.time(day, night);
    }
    
    public void performTemp(Text tempText){
        
        tempBehavior.temp(tempText);
    }
    
    public void setTimeBehavior(TimeBehavior tb) {
        timeBehavior = tb;
    }
    
    public void setTempBehavior(TemperatureBehavior pb) {
        tempBehavior = pb;
    }
}
