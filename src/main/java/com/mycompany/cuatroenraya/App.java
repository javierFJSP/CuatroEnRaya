package com.mycompany.cuatroenraya;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        StackPane root = new StackPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        tablero Tablero = new tablero();
        root.getChildren().add(Tablero);
        
        ficha Ficha = new ficha(1);
        Ficha.setLayoutX(100);
        Ficha.setLayoutY(100);
        root.getChildren().add(Ficha);
        
        ficha Ficha2 = new ficha(2);
        Ficha2.setLayoutX(50);
        Ficha2.setLayoutY(50);
        root.getChildren().add(Ficha2);

    }
    
    
    public static void main(String[] args) {
        launch();
    }
    
}