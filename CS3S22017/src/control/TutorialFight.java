
package control;

import static control.Main.player;
import java.util.Scanner ;
import static jdk.nashorn.tools.ShellFunctions.input;
import  model.Hero;
import model.Weapon;
import model. *;
import model.Weapons.Sword;
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
           System.out.println("Y/N (must be capitalized)");
           String answer = query.nextLine();
           if(answer.equals("Y")){
               arenaAction();
           }else{
               MainMenu mainMenu = new MainMenu();
               mainMenu.inTown();
            if(answer.equals("y")){
                System.out.println("Please capitalize all letters.");
            }   
               
           }

       }
        Weapon godSlayer = new Sword("Wilfred, the Godslayer", 400, "Sword that slays gods.", 2, 9001);
        
        Entity jackson = new Entity();
      
        int totaldamage = 0;
        int finaldamage = 0;
        
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
            jackson.setCurrentHealth(16);
            jackson.setLevel(1);
            jackson.setMaxStanina(10);
            jackson.setDefense(6);
            jackson.setSpeed(4);
            jackson.setSealPoints(10);
        }
        
        private void block(){
            System.out.println( player.getName() + " decided to block!");    
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
            jackson.setMainWeapon(godSlayer);
        System.out.println("Jackson, The Sideburn Wrangler, has entered the arena!");
        System.out.println("Jackson: Welcome to the tutoral, " + player.getName() + "! Wilfred, The Godslayer and I will see to it that you get educated!");   
        }
        public void actionStart() {    
            dialogue1();
            prepareTutorial();
            arenaStart();
        }
        private void arenaAttack(){
            if (jackson.getSpeed() > player.getSpeed()) {
            totaldamage = (jackson.getStrength() + jackson.getMainWeapon().getDamage()) - player.getDefense() ;
            if (totaldamage < 0) {
                System.out.println("You took no damage!");
            }else{
            player.setCurrentHealth(player.getCurrentHealth() - totaldamage);
            System.out.println("You took " + totaldamage + " damage!");
            }
            totaldamage =(player.getStrength() + player.getMainWeapon().getDamage()) - jackson.getDefense();
            if (totaldamage < 0) {
                System.out.println("Jackson took no damage!");
            }else{
            jackson.setCurrentHealth(jackson.getCurrentHealth() - totaldamage);
            System.out.println("Jackson took " + totaldamage + " damage!");
            }
                 }else{
            totaldamage =(player.getStrength() + player.getMainWeapon().getDamage()) - jackson.getDefense();
            if (totaldamage < 0) {
                System.out.println("Jackson took no damage!");
            }else{
            jackson.setCurrentHealth(jackson.getCurrentHealth() - totaldamage);
            System.out.println("Jackson took " + totaldamage + " damage!");
            }
                        totaldamage = (jackson.getStrength() + jackson.getMainWeapon().getDamage()) - player.getDefense() ;
            if (totaldamage < 0) {
                System.out.println("You took no damage!");
            }else{
            player.setCurrentHealth(player.getCurrentHealth() - totaldamage);
            System.out.println("You took " + totaldamage + " damage!");
            }
            }
                    if (jackson.getSpeed() > player.getSpeed() + 6) {
                         totaldamage = (jackson.getStrength() + jackson.getMainWeapon().getDamage()) - player.getDefense();
                           if (totaldamage < 0) {
                               System.out.println("Jackson attacked quickly!");
                               System.out.println("You took no damage!");
                           }else{
                               player.setCurrentHealth(player.getCurrentHealth() - totaldamage);
                               System.out.println("Jackson attacked quickly!");
                               System.out.println("You took " + totaldamage + " damage!");
                 }
                 }
                    if (player.getSpeed() > jackson.getSpeed() + 6) {
                         totaldamage = (player.getStrength() + player.getMainWeapon().getDamage()) - jackson.getDefense();
                            if (totaldamage < 0) {
                               System.out.println("You attacked quickly!");
                               System.out.println("Jackson took no damage!");
                           }else{
                               jackson.setCurrentHealth(jackson.getCurrentHealth() - totaldamage);
                               System.out.println("You attacked quickly!");
                               System.out.println("Jackson took " + totaldamage + " damage!");                           
                           
                 }
                 }
                    arenaAction();
        }
           private void arenaBlock(){
            totaldamage = (jackson.getStrength() + jackson.getMainWeapon().getDamage()) - (player.getDefense() * 2);
            if (totaldamage < 0) {
                System.out.println("You took no damage!");
            }else{
            player.setCurrentHealth(player.getCurrentHealth() - totaldamage);
            System.out.println("You took " + totaldamage + " damage!");
            }
            arenaAction();
        }
        private void concede(){
            System.out.println("Aw, giving up already? Well, I don't blame you.");
            System.out.println(player.getName() + " conceded!");
            System.out.println("Jackson: Hah! Weak! Come back when you grow a pair!");
            MainMenu mainMenu = new MainMenu();
            mainMenu.inTown();
        }
        private void items(){
            InventoryMenu itemsView = new InventoryMenu();
            itemsView.presentView();                   
        }
        public void arenaAction() {  
            boolean inBattle = true;
            System.out.println("[What do you want to do? You currently have " + player.getCurrentHealth() + " health. Jackson has " + jackson.getCurrentHealth() + " health.]");
            System.out.println(" A = Attack, B = Block, I = Item, C = Concede, H = Help " );
            System.out.println("Choice: ");

            char choice = this.getInput();
          
            boolean running = true;
            this.totalDamage(jackson);
            while(running == true){
            switch(choice){
                
                case 'A': 
                    arenaAttack();
                    break;
                case 'B': 
                    arenaBlock();
                    break;
                case 'C':
                    concede();
                    break;
                case 'I':
                    items();
                    break;
                case 'H':
                    System.out.println("Hey! my name's Clippy, and I'm here to help! What do you need explained?");
                    System.out.println("1 - Combat, 2 - Blocking, 3 - Conceding");
                    System.out.println("Choice:");
                    int helpChoice = input.nextInt();
                    switch(helpChoice){
                    
                    case 1: 
                        System.out.println("Alright, I'll tell you what I know about combat."
                                + "Combat is the main point of this game. In combat, you have three options."
                                + "You can attack, block, or defend. If your speed is at least 6 higher than the opposition, you attack twice.");
                        break;
                    case 2:
                        System.out.println("When you block, your defense is doubled, however you still take damage."  );
                        break;
                    case 3:    
                        System.out.println("This seems fairly self- explanatory, but since you pushed '3', I'll tell you anyway. "
                                + "When you concede, you automatically lose the fight and any resources you expended during that fight.");
                        break;
                        
                    }
            if(player.getCurrentHealth() == 0){
                System.out.println(player.getName() + " died!");
                running = false;
            }
            
            }
            } 
        }
 
    }
    

    


