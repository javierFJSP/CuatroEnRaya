package com.mycompany.cuatroenraya;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;


public class tablero extends Pane {

    
    public tablero() {
        for(int i=0; i<8; i++){
            Line line = new Line(ficha.TAM_FICHA*i, ficha.TAM_FICHA, ficha.TAM_FICHA*i, ficha.TAM_FICHA*7);
            this.getChildren().add(line);
        }
    }
    
}
