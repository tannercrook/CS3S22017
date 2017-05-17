/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model. *;
import control.*;
import view.*;

/**
 *
 * @author pi
 */
public class MainMenu extends View {
    
    public static void main(String[] args) {
        System.out.println();
    }
    public void inTown(){
        boolean working = true;
        while (working == true){
            System.out.println("You are in Town.");
            System.out.println("Please choose what you would like to do.");
            System.out.println("I = Inventory"
                    +          "A = Go to the Arena "
                    +          "S = Go to the Shop"
                    +          "H = Go to your House");
            int choice = input.nextInt();
            switch (choice){
                case 'A':
                    System.out.println("You went to the Arena.");
                    TutorialFight fight = new TutorialFight();
                    fight.arenaStart();
                    working = false;
                    break;
                case 'S': 
                    System.out.println("You went to the Shop.");
                    working = false;
                    break;
                case 'H':
                    System.out.println("You went to your House.");
                    working = false;
                    break;
                case 'I':
                    InventoryMenu inventoryView = new InventoryMenu();
                    inventoryView.presentView();
                    working = false;
                    break;
                default:
                    System.out.println("That is not a valid option.");
                    System.out.println("Please double check that your choices are capitalized.");
                    working = true;
                    break;
            }
        }
    }
}
