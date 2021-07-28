/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.clock.fx.model;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Julia Fideles
 */
public class BinaryClockFX extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent BinaryClock = FXMLLoader.load(getClass().getResource("/binary/clock/fx/FXML/Clock.fxml"));
        Image icon = new Image(getClass().getResourceAsStream("/binary/clock/fx/icons/315090_file_java_icon.png"));
        stage.getIcons().add(icon);
        
        Scene scene = new Scene(BinaryClock);
        
        stage.setTitle("Binary Clock");
        stage.setScene(scene);
        stage.show();
        
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
