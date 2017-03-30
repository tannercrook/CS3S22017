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
            for (int i = 0; i < this.amount; i++) {
            System.out.println(i+ "     " + this.items[i].name + "    " + this.items[i].worth);
            }
        }
    
        for (int i = 0; i <= this.size - this.amount - 1; i++) {
        System.out.println("[Empty]");
        }
        System.out.println("=============================");
        System.out.println();
        System.out.println();
    }
    
    public void addItem(Item item) {
        this.amount = this.amount + 1;
        System.out.println(item.name + " Added to bag.");
        System.out.println();
    }
    
    public Consumable getItemAtIndex(int index) {
        return this.items[index];
        
    }
    
}
