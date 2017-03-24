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
public class Inventory {

    //Size
    int size = 5;
    int amount = 0;
    
    //Items
    Consumable[] items = new Consumable[this.size];
    
    public Inventory() {
        
    }
    
    public void print() {
    
        System.out.println();
        System.out.println();
        System.out.println("Slot        Item        Worth");
        System.out.println("=============================");
        
        if (this.amount > 0) {
        
            for (int i = 0 < this.amount; i++)
        
        }
    
    }
    
}
