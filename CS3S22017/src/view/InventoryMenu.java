/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.InventoryControl;


public class InventoryMenu extends View {

    public static InventoryControl control = new InventoryControl();
    
    public InventoryMenu() {
        super("\n\nINVENTORY\n"
                + "=============\n"
                + "C - Contents\n"
                + "V - View Item\n"
                + "U - Use Item\n"
                + "E - Equip\n"
                + "D - Drop\n"
                + "B - Back\n\n");
    }
    
    
    @Override
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'C':
                    this.listItems();
                    break;
                case 'V':
                    this.viewItem();
                    break;
                case 'U':
                    this.useItem();
                    break;
                case 'E':
                    this.equipWeapon();
                    break;
                case 'D':
                    this.dropItem();
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
    
    
    public void listItems() {
        this.control.listInventory();
    }
    
    public void viewItem() {
        System.out.println("Enter Item Number.");
        System.out.print("Number: ");
        int index = this.input.nextInt();
        input.nextLine();
        this.control.viewItem(index);
    }
    
    public void useItem() {
        
    }
    
    public void equipWeapon() {
        System.out.println("Enter Weapon Number.");
        System.out.print("Number: ");
        int index = this.input.nextInt();
        input.nextLine();
        this.control.equipWeapon(index);
    }
    
    public void dropItem() {
        System.out.println("Enter Item Number.");
        System.out.print("Number: ");
        int index = this.input.nextInt();
        input.nextLine();
        this.control.dropItem(index);
    }
    
    public void quit() {
        
    }
}
    

