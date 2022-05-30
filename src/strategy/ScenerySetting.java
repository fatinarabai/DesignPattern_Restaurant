package strategy;

import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class ScenerySetting {
    public static void init(ImageView day, ImageView night, Text tempText){
        Scenery dayScene = new DayScenery();
        dayScene.setTimeBehavior(new DayTime());
        dayScene.setTempBehavior(new Warm());
        
        Scenery nightScene = new NightScenery();
        nightScene.setTimeBehavior(new NightTime());
        nightScene.setTempBehavior(new Cold());
        
//        tempText.setText("test suhu");
        
        //false is day, true is night
        if(dayScene.getStatus()) {
            dayScene.setStatus(false);
            dayScene.performTime(day, night);
            dayScene.performTemp(tempText);
            
        } else {
            nightScene.setStatus(true);
            nightScene.performTime(day, night);
            nightScene.performTemp(tempText);
        }
    }
}
