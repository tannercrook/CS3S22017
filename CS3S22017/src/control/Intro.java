/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static control.Main.player;
import java.util.Scanner;
import model.*;

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
        while ("no".equals(player.getAnswer())){
        System.out.println("Announcer: Oh, " + player.getName() + ". Is that correct?");
        System.out.println("IS " + player.getName() + " CORRECT? 'Y' OR 'N'");
        player.setAnswer(input.nextLine());
            switch (player.getName()){
                case "Y":
                    player.setAnswer("yes");
                    break;
                case "N":
                    System.out.print("Announcer:It's not " + player.getName() +"? Then what is it?");
                    System.out.print("ENTER YOUR NAME BUT, PLEASE, DO IT RIGHT THIS TIME");
                    player.setName(input.nextLine());
                    break;
            }
        }
            
            
        Entity jackson = new Entity();
        
        jackson.attack(player);
        
        
        
    
        player.setTitle("The Novice Fighter"); 
        System.out.println("Okay then, in today's battle we have- Jackson, 'The Sideburn Wrangler!' and " + player.getName() + ", " + player.getTitle() + "! Let the fight begin!");
        
        
        }
}


        
                    
                
        
         
            
            
        
        
        
        
    
    
    

