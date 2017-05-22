
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//send help
package model;
/*
@author Kevin Hanson(realitylarkcrown@gmail.com)
*/

public class Weapon extends Item {
    
    int damage = 0;
    int durability = 10;
    int level = 1;
    private String description;
    
    public Weapon() {
        super();
        this.damage = 10;
        this.level = 1;
 
    }
    public Weapon(String name, int worth, String description, int damage, int durability, int level) {
        this.name = name;
        this.worth = worth;
        this.description = description;
        this.damage = damage;
        this.durability = durability;
        this.level = level;
        
    }
    
    public void printStats() {
        System.out.println(damage);
        System.out.println(durability);
        System.out.println(level);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return worth;
    }

    public void setValue(int worth) {
        this.worth = worth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
 }
//getter and setters

