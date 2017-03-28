
package control;

import static control.Main.player;
import java.util.Scanner ;
import static jdk.nashorn.tools.ShellFunctions.input;
import  model.Hero;
import model.Weapon;
public class Combat {

    
 /* Arena has 3 options: 1- Find a Fight, 2- Redo Tutorial, 3- Challenge next boss.(auto enters into tutorial) 
    1. Jackson, The Sideburn Wrangler - tutorial boss, ridiculously easy to defeat. Crazily named weak sauce weapon. “Wilfred, the Godslayer”.
    2. Taylor, The Big Mama
    3. Eli, The Llama Cavalier
    4. Kevin, The Harbinger of Larks
    5. Michael, The Rito Champion
    6. Jarum, The Electric Slime 
    7. Eilana, The Psychotic Witch
    8. Tanner, The Bearded King 
    9. Create "Beardslayer"  
 */   Scanner input = new Scanner(System.in);
      protected char getInput() {
        
        System.out.print("Choice: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();
        char choice = entry.charAt(0);
        return choice;
    }  
    private static class tutorialFight {
        
        private void block(){
            System.out.println( player.getName() + "decided to block!");    
        }
        private void attackOption(){
            
        }
        Scanner selection = new Scanner(System.in);
        private void arenaAction() {   
            System.out.println("Here ya go, " + player.getName() + "the tutorial.");
            System.out.println("Jackson, The Sideburn Wrangler, has entered the arena!");
            System.out.println("Welcome to the tutoral, " + player.getName() + "! Wilfred, The Godslayer and I will see to it that you get educated!");
            System.out.println("So, you're fighting, are ya? Well, what do ya want to do? A = Attack, B = Block, I = Item, C = Concede, H = Help " );
            System.out.println("Choice: ");
             choice = input.nextLine();
            
            switch(input){
                
                case 'A': 
                    player.getStrength();
                    
                           
                           
                           
                    
                case 'B': 
                    block();
                    player.getMaxHealth();
                    player.getBlockDefense();
                    
                    
                case 'C':
                    
                
                case 'H':
                    System.out.println("Hey! my name's Clippy, and I'm here to help! What do you need explained?/n");
                    System.out.println("1 - Combat, 2 - Blocking, 3 - Conceding/n");
                    System.out.println("Choice:/n");
                    int helpChoice = input.nextInt();
                    
                    case 1: 
                        System.out.println("Alright, what do you need to know about combat?/n");
                        System.out.println("P - What happens when I attack?, Q - What happens if my enemy attacks?, R - Quit");
                    
                    
                    
                    
                    
                    
                    
                    
                 
                        
                        
                        
                        
                       
                    
                    
                    
                    
                               
            
            
            
            
            
            }
        }
    }
}
    


