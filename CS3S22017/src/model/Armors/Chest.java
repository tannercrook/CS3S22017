/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Armors;

import model.Armor;

/**
 *
 * @author Kevin
 */
public class Chest extends Armor{
    
    private String description;
    private String name;
    private int value;
    private int defense;
    private int amount;
    private int level;
    private int weight;
    
    public Chest() {
        this.defense = 0;
        this.level = 1;
        this.weight = 0;
    }
    
    public Chest(String name, int value, String description, int defense, int weight, int amount, int level) {
        this.name = name;
        this.value = value;
        this.description = description;
        this.defense = defense;
        this.weight = weight;
        this.amount = amount;
        
    }
    
    public void printStats() {
        System.out.println(defense);
        System.out.println(weight);
    }
}


