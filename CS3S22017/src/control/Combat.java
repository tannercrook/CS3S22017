
package control;

import static control.Main.player;
import java.util.Scanner ;
import static jdk.nashorn.tools.ShellFunctions.input;
import  model.Hero;
import model.Weapon;
import model. *;
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
 */   

    private static class tutorialFight {
        
        
        Entity jackson = new Entity();
        Scanner input = new Scanner(System.in);  
        protected char getInput() {
   
        System.out.print("Choice: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();
        char choice = entry.charAt(0);
        return choice;
    }  
        private void block(){
            System.out.println( player.getName() + "decided to block!");    
        }

        
        private int totalDamage(Entity attacker) {
            return attacker.getMainWeapon().getDamage();
                
            }
        public int getTotalDamage(Entity attacker){
                return this.totalDamage(attacker);
        } 
        public int resultHealth(){
            
          int resultDamage = player.getCurrentHealth() - this.totalDamage(jackson);
          return resultDamage;
        }
        private void dialogue1(){
        System.out.println("Here ya go, " + player.getName() + "the tutorial.");
        System.out.println("Jackson, The Sideburn Wrangler, has entered the arena!");
        System.out.println("Welcome to the tutoral, " + player.getName() + "! Wilfred, The Godslayer and I will see to it that you get educated!");   
        }
        
        private void arenaAction() {  
            System.out.println("So, you're fighting, are ya? Well, what do ya want to do? A = Attack, B = Block, I = Item, C = Concede, H = Help " );
            System.out.println("Choice: ");

            char choice = this.getInput();
            
            Weapon godSlayer = new Weapon("Wilfred, the Godslayer", 400, "Sword that slays gods.", 1, 500, 1);
            jackson.setMainWeapon(godSlayer);
            
            this.totalDamage(jackson);

            switch(choice){
                
                case 'A': 
                    player.getStrength();
                    
                           
                    jackson.attack(player);
                           
                    
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
                        System.out.println("P - What happens when I attack?/n Q - What happens if my enemy attacks?/n R - Quit");
                    
                    
                    
                    
                    
                    
                    
                    
                 
                        
                        
                        
                        
                       
                    
                    
                    
                    
                               
            
            
            
            
            
            }
        }

       
    }
}
    


