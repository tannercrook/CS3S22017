/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pi
 */
public class Armor extends Item {
    
    int level = 1;
    int defense;
    private String description;
    private int value;
    private String name;
    
    public Armor() {
        super();
        this.level = 1;
        this.defense = 1;
 
    }
    public Armor(String name, int value, String description, int defense, int level) {
        this.defense = 10;
        this.name = name;
        this.defense = defense;
        this.value = value;
        this.description = description;
        this.level = level;
        
    }
    
    public void printStats() {
        System.out.println(defense);     
        System.out.println(level);
    }
    
 }
//Please commit

