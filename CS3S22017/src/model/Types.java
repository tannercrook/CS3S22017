/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import static control.Main.player;
/**
 *
 * @author pi
 */
public class Types {
    
    public void basic(){
        player.setMaxHealth(5);
        player.setMaxStamina(10);
        player.setStrength(5);
        player.setSpeed(5);
        player.setDefense(5);
        player.setMaxExp(100);
        
    }
    
    // knight
    
    public void knight(){
        player.setMaxHealth(player.maxHealth + 4);
        player.setCurrentHealth(player.maxHealth);
        player.setMaxStamina(player.maxStamina - 2);
        player.setCurrentStamina(player.maxStamina);
        player.setStrength(player.strength);
        player.setSpeed(player.speed - 2);
        player.setDefense(player.defense + 4);
        player.setMaxExp(player.maxExp);
        player.setCurrentExp(0);
        player.setSealPoints(0);
        //4
        
    }
    public void assassin(){
        player.setMaxHealth(player.maxHealth + 2);
        player.setCurrentHealth(player.maxHealth);
        player.setMaxStamina(player.maxStamina + 2);
        player.setCurrentStamina(player.currentStamina);
        player.setStrength(player.strength - 2);
        player.setSpeed(player.speed + 4);
        player.setDefense(player.defense - 2);
        player.setMaxExp(player.maxExp);
        player.setCurrentExp(0);
        player.setSealPoints(0);
        //4
    }
    public void barbarian(){
        player.setMaxHealth(player.maxHealth);
        player.setCurrentHealth(player.maxHealth);
        player.setMaxStamina(player.getMaxStamina());
        player.setCurrentStamina(player.maxStamina);
        player.setStrength(player.strength + 4);
        player.setSpeed(player.speed);
        player.setDefense(player.defense);
        player.setMaxExp(player.maxExp);
        player.setCurrentExp(0);
        player.setSealPoints(0);
        //4
    }
}
