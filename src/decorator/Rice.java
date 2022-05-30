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
public class Rice extends Food {

    public Rice(){
        description="Rice";
    }
    @Override
    public double getCalory() {
       return 130.00;
    }

    @Override
    public void setImage(ImageView imageView) {
       imageView.setVisible(true);  
                
    }
    
}
