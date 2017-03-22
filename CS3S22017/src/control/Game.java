/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.View;
import java.util.Scanner;
import static control.Main.player;

/**
 *
 * @author tacrook@lcsd2.org
 */
public class Game {
    
    
    public Game() {
        
    }
    
    
    public void gameSetup() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to GAME!");
        System.out.println("Enter your first name, hero:");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        
        player.setName(firstName);
        
    }
    
}
