package DoorGame;

import java.io.*;

import static DoorGame.Menu.*;
import static DoorGame.Highscore.*;

public class Logic {

    public static String menuchoicestring, userchoicestring, savescore = "no", 
    viewscore, name;
    public static int menuchoice, userchoice, botchoice, score;
    public static boolean firstgame = true;

    public static void logic() throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        do {
                        
            System.out.println("Choose a door! \n [1] [2] [3]");
            userchoicestring = br.readLine();
            userchoice = Integer.parseInt(userchoicestring);
            botchoice = (int) (Math.random()*3+1);
            score++;

        } while (userchoice != botchoice);

        System.out.println("Game Over! \nYour score is: " + score);
        score = 0;
        System.out.println("Do you want to save your score? (y/n)");
        savescore = br.readLine().toLowerCase();

        switch (savescore) {
            
            case "y": case "yes":
            
                highscore();
                break;

            default:
                
                break;
        }
        menu();
    }
    
}