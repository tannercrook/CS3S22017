/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.*;
import java.util.Scanner;
import model.Weapon;
import model.Weapons.*;
/**
 *
 * @author pi
 */
public class Hero {
    
int level = 0;
int maxHealth = 0;
int currentHealth = 0;
int maxStamina = 0;
int currentStamina = 0;
int strength = 0;
int speed = 0;
int defense = 0;
int blockDefense = defense * 2; 
int currentExp = 0;
int maxExp = 0;
int sealPoints = 0;




String name = "Null";
String type = "Null";
String title = "Null";
String answer = "Null"; 

Weapon mainHand;




public Hero () {
   
}

    public void attack(Entity victim) {
        int heroDamage = this.strength + this.getMainWeapon().getDamage();
        victim.setCurrentHealth(victim.getCurrentHealth()-heroDamage);
    }

    public Weapon getMainWeapon() {
            return mainHand;
    }
    public void setMainWeapon(Weapon toEquip){
        this.mainHand = toEquip;
    }
    public int getBlockDefense() {
        return blockDefense;
    }

    public void setBlockDefense(int blockDefense) {
        this.blockDefense = blockDefense;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

  
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    public int getMaxStamina() {
        return maxStamina;
    }

    public void setMaxStamina(int maxStanina) {
        this.maxStamina = maxStanina;
    }

    public int getCurrentStamina() {
        return currentStamina;
    }

    public void setCurrentStamina(int currentStanima) {
        this.currentStamina = currentStanima;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getCurrentExp() {
        return currentExp;
    }

    public void setCurrentExp(int currentExp) {
        this.currentExp = currentExp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public void setMaxExp(int maxExp) {
        this.maxExp = maxExp;
    }

    public int getSealPoints() {
        return sealPoints;
    }

    public void setSealPoints(int sealPoints) {
        this.sealPoints = sealPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void heroAttack(Entity jackson) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void equipWeaponAtIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class bag {

        public static void removeItemAtIndex(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public static Object getItemAtIndex(int index) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public static void print() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public bag() {
        }
    }




}

