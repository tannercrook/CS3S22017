/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;
import model.Hero;
import model.Entity;
import control.*;
import model.*;
import model.Weapons.*;
/**
 *
 * @author pi
 */
public class Main {

public static Hero player;

private static void setPlayer(){
    player.setLevel(1);
    player.setCurrentHealth(15);
    player.setMaxHealth(15);
    player.setStrength(1);
    player.setSpeed(5);
    player.setDefense(7);
    player.setCurrentExp(0);
    player.setMaxExp(40);
    player.setSealPoints(5);
}

//int level = 0;
//int maxHealth = 0;
//int currentHealth = 0;
//int maxStamina = 0;
//int currentStamina = 0;
//int strength = 0;
//int speed = 0;
//int defense = 0;
//int blockDefense = defense * 2; 
//int currentExp = 0;
//int maxExp = 0;
//int sealPoints = 0;


public static Entity jackson;
public static void main(String[] args) {
    player = new Hero();
    
        //Sword bladeOfWoe = new Sword("Blade of Woe"(Name),100(Value),"Test Sword"(Desc),50(Damage),10(level));
Sword trainingSword = new Sword("Training Sword ",1," Sword of the Starts ",2,1);
Axe barbAxe = new Axe("Barbariac Axe ",10," Axe from a Barbarian ",4,2);

player.setMainWeapon(trainingSword);


Weapon llamaSlayer = new Lance("Llama Slayer ",100," The Weapon made of steel and Llama fur ",10,5);
Axe larkScythe = new Axe("Lark Scythe ", 200," Weapon made from Lark feathers, blade is shaped like a beak ",10,5);
//Sword beardSlayer = new Sword("Beard Slayer", )
 Axe portableShovel = new Axe("Portable Shovel ",40," Weapon made of rust and steel ", 5,3);    

 
 player.inventory.addItem(trainingSword);

Intro tutorial = new Intro();
    
    tutorial.gameSetup();
    setPlayer();
    
    TutorialFight main = new TutorialFight();     
         main.actionStart();
  
    
}

}
