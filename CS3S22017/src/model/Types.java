/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.Hero;
/**
 *
 * @author pi
 */
public class Types {
    public void knight(){
        player.setMaxHealth(player.maxHealth + 4);
        player.setCurrentHealth();
        player.setMaxStamina();
        player.setCurrentStamina();
        player.setStrength();
        player.setSpeed(player.speed - 2);
        player.setDefense();
        player.setCurrentExp();
        player.setMaxExp();
        player.setSealPoints();
        
    }
    public void assassin(){
        player.setMaxHealth(player.maxHealth + 2);
        player.setCurrentHealth();
        player.setMaxStamina();
        player.setCurrentStamina();
        player.setStrength();
        player.setSpeed(player.speed + 5);
    }
    public void barbarian(){
        player.setMaxHealth(player.maxHealth);
        player.setSpeed(player.speed);
    }
}
