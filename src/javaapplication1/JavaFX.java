/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.*;
import java.util.Random;


/**
 *
 * @author 2483268
 * Github repo link: https://github.com/Johnnyboi9907/Lab-02-ProgDev.git
 */
public class JavaFX extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
      @Override
    public void start(Stage stage) {
       BorderPane root = new BorderPane();
       StackPane middle = new StackPane();
       
        Label top = new Label("Random game");
        Label bottom = new Label("Waiting...");
        Label lblImage = new Label("");
        
        root.setTop(top);
        root.setBottom(bottom);
        
        middle.getChildren().addAll(lblImage);
        root.setCenter(middle);
        
        Random random = new Random();
        int num = random.nextInt(20) + 101;
        String filepath = "file:images\\" + num + ".jpg";
        Image image = new Image(filepath);
        lblImage.setGraphic(new ImageView(image));
        
       Scene scene = new Scene(root, 250, 300); 
       stage.setTitle("Java Games");
       stage.setScene(scene);
       stage.show();
    }
    
}
