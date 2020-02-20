/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuatroenraya;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Javier
 */
public class ficha extends Group{

   // Group group = new Group();
    static final short TAM_FICHA = 40;
    
    public ficha(int numJugador) {
        Circle circle1 = new Circle();
        circle1.setRadius(TAM_FICHA * 0.5);
        this.getChildren().add(circle1);
        
        Circle circle2 = new Circle();
        circle2.setRadius(TAM_FICHA * 0.35);
        this.getChildren().add(circle2);
        
        if(numJugador == 1){
            circle1.setFill(Color.GREEN);
            circle2.setFill(Color.YELLOW);
        } else {
            circle1.setFill(Color.BLUE);
            circle2.setFill(Color.RED);
        }
    }
    
}
