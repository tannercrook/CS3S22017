/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.Main.player;
import java.util.Scanner;

/**
 *
 * @author pi
 */
public class Intro {
    
    public Intro(){
    }
    

        public void gameSetup() {
        Scanner input = new Scanner(System.in);
        System.out.println("Announcer: Today's battle is between- Jackson, 'The Sideburn Wrangler!' and, uh, his is hardly even legible. Could the contestant please just announce his name?");
        System.out.println("ENTER YOUR NAME");
        player.setName(input.nextLine());
        System.out.println("Announcer: Oh, " + player.getName() + ". Is that correct?");
        System.out.println("IS " + player.getName() + " CORRECT? 'Y' OR 'N'");
        player.setAnswer(input.nextLine());
        if (player.getAnswer("N")) { 
            System.out.println("Oh, it's not? Then what is it?");
            System.out.println("ENTER YOUR NAME (BUT PLEASE MAKE IT RIGHT THIS TIME)");
        }
            
            
        
        
        
        
    
    
    
}
}