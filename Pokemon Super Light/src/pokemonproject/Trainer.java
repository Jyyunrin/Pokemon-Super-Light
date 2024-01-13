/**
 * 
 */
package pokemonproject;

import java.util.ArrayList;

/**
 * Represents a Pokemon Trainer containing position on map.
 */
public class Trainer {
    
    //Name of the Trainer;
    public String name;
    
    //Represents position of player
    public int xPos;
    public int yPos;
    
    //Represents the trainer's Pokemon team
    public ArrayList<Pokemon> team = new ArrayList<>();
    
    private Pokemon starter;
    
    //Constructor for trainer
    public Trainer(String name) {
        this.name = name;
        xPos = 0;
        yPos = 0;
        
        starter = new Pokemon();
        starter.setLevel(5);
        
        team.add(starter);
        
    }
    
    public int getXPos() {
        return xPos;
    }
    
    public int getYPos() {
        return yPos;
    }
    
    public void moveUp() {
        yPos++;
    }
    
    public void moveDown() {
        yPos--;
    }
    
    public void moveRight() {
        xPos++;
    }
    
    public void moveLeft() {
        xPos--;
    }

    public void checkBounds(int[] grid) {
        if (yPos > grid[0]) {
            yPos = grid[0];
            System.out.println("Bonk! you hit the top wall. try again");
        } else if (yPos < grid[2]) {
            yPos = grid[2];
            System.out.println("Bonk! you hit the bottom wall. try again");
        } else if (xPos > grid[1]) {
            xPos = grid[1];
            System.out.println("Bonk! you hit the right wall. try again");
        } else if (xPos < grid[3]) {
            xPos = grid[3];
            System.out.println("Bonk! you hit the left wall. try again");
        }
    }

}
