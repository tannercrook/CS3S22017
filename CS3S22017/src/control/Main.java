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


public static Entity Jackson;
public static void main(String[] args) {
    player = new Hero();
    
    Intro tutorial = new Intro();
    
    tutorial.gameSetup();
    
    //Sword bladeOfWoe = new Sword("Blade of Woe"(Name),100(Value),"Test Sword"(Desc),50(Damage),10(level));
Sword trainingSword = new Sword("Training Sword",1,"Sword of the Starts",2,1);
Axe barbAxe = new Axe("Barbariac Axe",10,"Axe from a Barbarian",4,2);

player.setMainWeapon(trainingSword);


Lance llamaSlayer = new Lance("Llama Slayer",);
    
    
}

}
