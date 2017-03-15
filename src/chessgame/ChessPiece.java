/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author virk04
 */
public abstract class ChessPiece {
    
    private String name;
    private String color;
    private int xPosition;
    private int yPosition;

    public ChessPiece(String name, String color, int xPosition, int yPosition) {
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }
    
    public boolean canMoveTo(int x, int y){
        if(x <= 8 && y <= 8 && x >= 1 && y >= 1 && x!= xPosition && y!= yPosition) { 
            return true;
    }  else {
            return false;
        }                 

    }
    
    public int positionToField(int x, int y){
       Map<String, Integer> tiles = new HashMap<>();
        
    }
    
    public int possibleMoves(){
        return 0; // All possible Tiles
    }
    
    public String show(){
        return null;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
    
    
    
    }
    
    
    
    
            
    

