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
public class Helmet extends Armor{
    
    private String description;
    private String name;
    private int value;
    private int defense;
    private int amount;
    private int weight;
    private int level;
    
    public Helmet() {
        this.defense = 0;
        this.level = 1;
        this.weight = 0;
    }
    
    public Helmet(String name, int value, String description, int defense, int weight, int amount) {
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


