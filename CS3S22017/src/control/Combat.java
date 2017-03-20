
package control;

import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;
import java.util.Scanner ;
import static jdk.nashorn.tools.ShellFunctions.input;

public class Combat {
 /* Arena has 3 options: 1- Find a Fight, 2- Redo Tutorial, 3- Challenge next boss. 
    1. Jackson, The Sideburn Wrangler - tutorial boss, ridiculously easy to defeat. Crazily named weak sauce weapon. “Wilfred, the Godslayer”.
    2. Taylor, The Big Mama
    3. Eli, The Llama Cavalier
    4. Kevin, The Harbinger of Larks
    5. Michael, The Rito Champion
    6. Jarum, The Electric Slime 
    7. Eilana, The Psychotic Witch
    8. Tanner, The Bearded King 
    9. Create "Beardslayer"  
 */   

    

    private static class arenaAction {

        private arenaAction() {
            
            System.out.println("Hello,welcome to the arena! What would you like to do today? 1- Challenge Tutorial Boss, 2- Quit " );
            System.out.println("Choice: ");
            int choice = input.nextInt();
        }
    }
}

