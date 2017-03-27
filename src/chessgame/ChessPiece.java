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
        if(x <= 8 && y <= 8 && x >= 1 && y >= 1 && x!= xPosition && y!= yPosition) { 
            return true;
    }  else {
            return false;
        }                 

    }
    
    public String positionToField(int x, int y){
        String tempString = null;
        
        switch(x) {
            case 1: tempString += "A";
            break;
            
            case 2: tempString += "B";
            break;
            
            case 3: tempString += "C";
            break;
            
            case 4: tempString += "D";
            break;
            
            case 5: tempString += "E";
            break;
            
            case 6: tempString += "F";
            break;
            
            case 7: tempString += "G";
            break;
            
            case 8: tempString += "H";
                
        }
        switch(y){
            case 1: tempString += "1";
            break;
            
            case 2: tempString += "2";
            break;
            
            case 3: tempString += "3";
            break;
            
            case 4: tempString += "4";
            break;
            
            case 5: tempString += "5";
            break;
            
            case 6: tempString += "6";
            break;
            
            case 7: tempString += "7";
            break;
            
            case 8: tempString += "8";
            break;
            
        }

      return tempString;  
    }
    
    public int possibleMoves(){
        String[] moves = new String[22];
        int counter = 0;
               for (int i = 0; i < 8; i++) {
                   for (int j = 0; j < 8; j++) {
                       if(canMoveTo(i,j)== true){
                           moves[counter] = positionToField(i,j);
                           counter = counter +1;
                       }
                       
                   }
            
        }
              
              
            
        
              
           
        
        
        
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
    
    
    
    
            
    

