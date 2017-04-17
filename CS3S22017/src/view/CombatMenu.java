/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


public class CombatMenu extends View {

    public CombatMenu() {
        super("Get Ready to Fight/n"
                + "A = Attack/n"
                + "I = Use Item/n"
                + "B = Block/n"
                + "C = Concede");
    }
  @Override
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'A':
                    CombatMenu attackView = CombatMenu();
                    attackView.presentView();
                    break;
                case 'I':
                    InventoryMenu itemsView = InventoryMenu();
                    itemsView.presentView();
                    break;
                case 'B':
                    nextDamage enimyAttack
                    break;
                case 'C':
                    System.out.println("You Atempt to Flee");
                    
                default:
                    System.out.println("You did not select a valid option.");
                    break;
            }
        }
    }

    
}
