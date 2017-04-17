/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.Combat;


public class ArenaMenu extends View {

    public static Combat control = new Combat();
    
    public InventoryMenu() {
        super("\n\nINVENTORY\n"
                + "=============\n"
                + "B - Fight" + bossName
                + "X - Fight for XP\n"
                + "B - Back\n\n");
    }
    
    
    @Override
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'S':
                    this.l
                    break;
                case 'X':
                    CombatMenu combatView = CombatMenu();
                    combatView.presentView();
                    break;
                case 'B':
                    working = false;
                    break;
                default:
                    System.out.println("You did not select a valid option.");
                    break;
            }
        }
    }
}