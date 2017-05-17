
package control;

import static control.Main.player;
import java.util.Scanner ;
import static jdk.nashorn.tools.ShellFunctions.input;
import  model.Hero;
import model.Weapon;
import model. *;
import view.*;


    
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
    
    public class TutorialFight {
       Scanner input = new Scanner(System.in);
       Scanner query = new Scanner(System.in);
        public void arenaStart(){
           System.out.println("Welcome to the arena! Are you fixin' to fight?");
           System.out.println("Y/N");
           String answer = query.nextLine();
           if(answer == "N" ){
               MainMenu mainMenu = new MainMenu();
               mainMenu.inTown();
               
           }else if(answer == "Y"){
               arenaAction();
           }
       }
        
        Entity jackson = new Entity();
          
        protected char getInput() {
   
        System.out.print("Choice: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();
        char choice = entry.charAt(0);
        return choice;
    }  
        
        private void prepareTutorial() {
            jackson.setSpeed(1);
            jackson.setStrength(1);
            jackson.setMaxHealth(16);
            jackson.setLevel(1);
            jackson.setMaxStanina(10);
            jackson.setDefense(1);
            jackson.setSealPoints(10);
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
        
        public void arenaAction() {  
            dialogue1();
            prepareTutorial();
            System.out.println("So, you're fighting, are ya? Well, what do ya want to do? A = Attack, B = Block, I = Item, C = Concede, H = Help " );
            System.out.println("Choice: ");

            char choice = this.getInput();
            
            Weapon godSlayer = new Weapon("Wilfred, the Godslayer", 400, "Sword that slays gods.", 1, 500, 1);
            jackson.setMainWeapon(godSlayer);
            
            this.totalDamage(jackson);

            switch(choice){
                
                case 'A': 
                    player.getStrength();
                    player.attack(jackson);  
                    
                    if((player.getSpeed() - jackson.getSpeed()) > 6){
                        player.attack(jackson);
                    }
                    jackson.attack(player);
                    arenaAction();
                    break;
                case 'B': 
                    block();
                    player.getMaxHealth();
                    player.getBlockDefense();
                    jackson.blockedAttack(player);
                    System.out.println("You took " + this.totalDamage(jackson) + " damage!");
                    arenaAction();
                    break;
                case 'C':
                    System.out.println("Aw, giving up already? Well, I don't blame you.");
                    System.out.println(player.getName() + " conceded!");
                    System.out.println("Jackson: Hah! Weak! Come back when you grow a pair!");
                    MainMenu mainMenu = new MainMenu();
                    mainMenu.inTown();
                    break;
                case 'H':
                    System.out.println("Hey! my name's Clippy, and I'm here to help! What do you need explained?/n");
                    System.out.println("1 - Combat, 2 - Blocking, 3 - Conceding/n");
                    System.out.println("Choice:/n");
                    int helpChoice = input.nextInt();
                    break;
                case 'I':
                    InventoryMenu itemsView = new InventoryMenu();
                    itemsView.presentView();
                    arenaAction();
                    break;
                    case 1: 
                        System.out.println("Alright, I'll tell you what I know about combat./n"
                                + "Combat is the main point of this game. In combat, you have three options./n"
                                + "You can attack, block, or defend. If your speed is at least 6 higher than the opposition, you attack twice.");
                        break;
                    case 2:
                        System.out.println("When you block, your defense is doubled, however you still take damage."  );
                        break;
                    case 3:    
                        System.out.println("This seems fairly self- explanatory, but since you pushed '3', I'll tell you anyway./n "
                                + "When you concede, you automatically lose the fight and any resources you expended during that fight.");
                        break;
                        

            }
        }

      
    }
    

    

