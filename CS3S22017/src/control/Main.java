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
    
    
}
        
}
