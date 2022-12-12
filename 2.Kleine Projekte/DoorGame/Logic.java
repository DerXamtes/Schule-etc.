package DoorGame;

import java.io.*;

import static DoorGame.Menu.*;
import static DoorGame.Highscore.*;

public class Logic {

    public static String menuchoicestring, userchoicestring, savescore = "no", viewscore, name, line, delscores;
    public static int menuchoice, userchoice, botchoice, score, highscore;
    public static boolean firstgame = true, topten;
    public static File highscorefile = new File("2.Kleine Projekte/DoorGame/Highscore.txt");

    public static void logic() throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {   
            
            System.out.println("Choose a door! \n [1] [2] [3]");
            userchoicestring = br.readLine();
            userchoice = Integer.parseInt(userchoicestring);
            botchoice = (int) (Math.random()*3+1);
            score++;

        } while (userchoice != botchoice);

        System.out.println("Game Over! \nYour score is: " + score);
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