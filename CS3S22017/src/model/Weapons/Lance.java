/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Weapons;

import model.Weapon;

/**
 *
 * @author eli
 */
public class Lance extends Weapon {

    private int damage;
    private int level;
    private String name;
    private int value;
    private String description;
    private int durability; 
    
    public Lance() {
        this.damage = 0;
        this.level = 1; 
    }
    public Lance (String name, int value, String description, int damage, int level ) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.damage = damage;
        this.level = level;
       
    }
    
    
    public void printStats() {
        System.out.println(damage);
        System.out.println(durability);
        System.out.println(level);
    }
}