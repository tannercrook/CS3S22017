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


public static Entity jackson;
public static void main(String[] args) {
    player = new Hero();
    
        //Sword bladeOfWoe = new Sword("Blade of Woe"(Name),100(Value),"Test Sword"(Desc),50(Damage),10(level));
Sword trainingSword = new Sword("Training Sword",1,"Sword of the Starts",2,1);
Axe barbAxe = new Axe("Barbariac Axe",10,"Axe from a Barbarian",4,2);

player.setMainWeapon(trainingSword);

 
Lance llamaSlayer = new Lance("Llama Slayer",100,"The Weapon made of steel and Llama fur",10,5);
Axe larkScythe = new Axe("Lark Scythe", 200,"Weapon made from Lark feathers, blade is shaped like a beak",10,5);
//Sword beardSlayer = new Sword("Beard Slayer", )
 Axe portableShovel = new Axe("Portable Shovel",40,"Weapon made of rust and steel", 5,3);    

 
 player.inventory.addItem(trainingSword);

Intro tutorial = new Intro();
    
    tutorial.gameSetup();
  
    TutorialFight main = new TutorialFight();     
    main.arenaAction();
  
    
}

}
