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
public class Item  {

    // General
    int itemID = 0;
    protected String name = "";
    protected int worth = 0;
    String description = "";
    String type = "";
    
    public Item() {
        this.itemID = 0;
        this.name = "An Item";
        this.worth = 0;
        this.description = "An item with unknowningness to life";
        this.type = "MISC";
    }
    
    public Item(int itemID, String name, int worth, String description, String type) {
        this.itemID = itemID;
        this.name = name;
        this.worth = worth;
        this.description = description;
        this.type = type;
    }
    
    public Item(String name, int worth) {
        this.name = name;
        this.worth = worth;
    }
    
    
    
    public void print() {
        System.out.println();
        System.out.println();
        System.out.println(this.name);
        System.out.println("----------------------");
        System.out.println(this.description);
        System.out.println("Worth: " + this.worth + "    Type: " + this.type);
        System.out.println("----------------------");
        System.out.println();
        System.out.println();
    }
    
    
    public void setDetails(String name, int worth, String description) {
        this.name = name;
        this.worth = worth;
        this.description = description;
    }
    
    
    
    

    public String getName() {
        return name;
    }

    public int getWorth() {
        return worth;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int worth) {
        this.worth = worth;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
