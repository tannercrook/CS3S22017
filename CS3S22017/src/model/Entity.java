/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import  model.*;
import model.Weapons.*;
/**
 *
 * @author pi
 */
public class Entity  {
    
int level = 0;
int maxHealth = 0;
int currentHealth = 0;
int maxStamina = 0;
int currentStamina = 0;
int strength = 0;
int speed = 0;
int defense = 0;
int currentExp = 0;
int maxExp = 0;
int sealPoints = 0;

String name = "Null";
String type = "Null";
String title = "Null";

Weapon mainHand = new Sword("Training Sword", 1, "A training sword", 5, 1);
    
boolean Hostlie;


    public Weapon getMainWeapon() {
        return mainHand;
    }
    
    public void setMainWeapon(Weapon toEquip) {
        this.mainHand = toEquip;
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

    public int getMaxStanina() {
        return maxStamina;
    }

    public void setMaxStanina(int maxStanina) {
        this.maxStamina = maxStanina;
    }

    public int getCurrentStanima() {
        return currentStamina;
    }

    public void setCurrentStanima(int currentStanima) {
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

    public boolean isHostlie() {
        return Hostlie;
    }

    public void setHostlie(boolean Hostlie) {
        this.Hostlie = Hostlie;
    }
    
    
    
    
    
    
    
    
    public void attack(Hero player) {
        System.out.println("test");
        System.out.println(this.getMainWeapon().getName());
        System.out.println("test");
        int damage = this.strength + this.getMainWeapon().getDamage();
        player.setCurrentHealth(player.getCurrentHealth()-damage);
    }
    public void blockedAttack(Hero player) {
        player.getLevel();
        player.getCurrentHealth();
        int damage = this.strength + this.getMainWeapon().getDamage();
        player.setCurrentHealth(player.getBlockDefense()-damage);
    }

}
