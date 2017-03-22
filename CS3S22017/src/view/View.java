/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author tacrook@lcsd2.org
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author tacrook
 */

import java.util.Scanner;

public class View {
    
    protected String menu = "";
    protected Scanner input = new Scanner(System.in);
    
    public View() {
        this.menu = "Hello, this is a menu!\n"
                    + "A - print 'Selected A'";
    }
    
    public View(String menu) {
        this.menu = menu;
    }
    
    protected char getInput() {
        System.out.println(this.getMenu());
        System.out.print("Choice: ");
        String entry = input.nextLine();
        entry = entry.toUpperCase();
        char choice = entry.charAt(0);
        return choice;
    }
    
    public void presentView() {
        boolean working = true;
        while (working) {
            char choice = this.getInput();
            switch (choice) {
                case 'A':
                    System.out.println("Selected A");
                    working = false;
                    break;
                default:
                    System.out.println("You did not select a valid option.");
                    break;
            }
        }
    }
    
    private String getMenu() {
        return this.menu;
    }
    
}


