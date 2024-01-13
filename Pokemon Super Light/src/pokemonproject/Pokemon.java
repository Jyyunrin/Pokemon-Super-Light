/**
 * 
 */

package pokemonproject;

import java.util.Random;

/**
 * Represents a Pokemon.
 */
public class Pokemon {
    
    private String name;
    private int level;
    private int experience;
    private int maxExperience;
    private int expGiven;
    private int hp;
    private boolean shiny;
    private String move1;
    private String move2;
    private String move3;
    private String move4;
    private boolean fainted;
    
    public Pokemon() {
        Random rand = new Random();
        
        name = pokemonSpecies(rand.nextInt(8));
        
        level = rand.nextInt(3) + 2;
        
        experience = 0;
        maxExperience = 10 * level;
        expGiven = 3 * level;
        
        
        hp = 2 * level + level + 10;
        
        shiny = isShiny(rand.nextInt(8191) + 1);
        
        move1 = "Tackle";
        move2 = "Tail Whip";
        
        fainted = false;
        
    
    }
    
    
    private String pokemonSpecies(int num) {
        String name = "";
        
        switch (num) {
        
        case 0:
            name = "Bulbasaur";
            break;
        case 1:
            name = "Charmandar";
            break;
        case 3:
            name = "Squirtle";
            break;
        case 4:
            name = "Pidgey";
            break;
        case 5:
            name = "Rattata";
            break;
        case 6:
            name = "Pikachu";
            
        case 7:
            name = "Piplup";
            
        }
        return name;
    }
    
    private boolean isShiny(int num) {
        Random rand = new Random();
        if (rand.nextInt(8191) + 1 == num) {
            return true;
        } else {
            return false;
        }
    }
    
    protected void setLevel(int num) {
        level = num;
    }
    
    public void gainLevel() {
        if (experience >= maxExperience) {
            level += 1;
            System.out.println("Your " + name + " has leveled up!");
            experience = experience - maxExperience;
            maxExperience = 10 * level;
        }
    }
    
    public void gainExp(Pokemon opponent) {
        experience += opponent.expGiven;
    }
    
    public void isFainted(Pokemon pokemon) {
        if (hp == 0) {
            fainted = true;
        }
    }
    
    public boolean encounterWild() {
        Random rand = new Random();
        int encounter = rand.nextInt(99) + 1;
        return (encounter <= 15);
    }

}
