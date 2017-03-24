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
        
    }
    public void assassin(){
        player.setMaxHealth(player.maxHealth + 2);
    }
    public void barbarian(){
        player.setMaxHealth(player.maxHealth);
    }
}
