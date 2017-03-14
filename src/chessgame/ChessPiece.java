/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chessgame;

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
        if(xPosition < 8 && yPosition < 8 && xPosition > 0 && yPosition > 0) { 
            return true;
    }  else {
            return false;
        }                 

    }
    }
    
    
    
    
            
    

