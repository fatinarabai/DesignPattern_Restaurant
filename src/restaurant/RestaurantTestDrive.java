/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author nurul
 */
public class RestaurantTestDrive extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        primaryStage.setTitle("Restaurant Design Patterns");
        primaryStage.setScene(new Scene(root, 920, 600));
        primaryStage.setResizable(false);
        primaryStage.setMaximized(false);

        primaryStage.show();
    }
    


    public static void main(String[] args) {
        launch(args);
    }
}
