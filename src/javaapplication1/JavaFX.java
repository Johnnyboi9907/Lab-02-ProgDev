/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author 2483268
 */
public class JavaFX extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
      @Override
    public void start(Stage stage) {
       BorderPane root = new BorderPane();
        
       Scene scene = new Scene(root, 250, 300); 
       stage.setTitle("Java Games");
       stage.setScene(scene);
       primaryStage.show();
    }
    
}
