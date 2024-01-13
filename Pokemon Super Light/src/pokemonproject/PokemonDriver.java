/**
 * 
 */

package pokemonproject;

import java.util.Scanner;

/**
 * 
 */
public class PokemonDriver {
    
    private final int[] gridBoundary = {10, 10, -10, -10};
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        System.out.println("Welcome to Pokemon Super Light, developed by Joe Lin");
        System.out.println("Please enter your name:");
        
        Scanner scan = new Scanner(System.in);
        
        String name = scan.next();
        
        Trainer trainer = new Trainer(name);
        
 
        
        

    }

}
