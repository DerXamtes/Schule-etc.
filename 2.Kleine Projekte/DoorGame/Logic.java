package DoorGame;

import java.io.*;

import static DoorGame.Menu.*;
import static DoorGame.Highscore.*;

public class Logic {

    public static String userchoicestring, savescore = "no";
    public static int menuchoice, userchoice, botchoice, score;
    public static boolean firstgame = true, delete;
    public static File highscorefile = new File("2.Kleine Projekte/DoorGame/Highscore.txt");

    public static void logic() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {   
            System.out.println("Choose a door! \n [1] [2] [3]");
            userchoice = Integer.parseInt(br.readLine());
            botchoice = (int) (Math.random()*3+1);
            if (userchoice == botchoice) {
                break;
            }
            score++;
        }

        System.out.println("Game Over! \nYour score is: " + score);
        System.out.println("Do you want to save your score? (y/n)");
        savescore = br.readLine().toLowerCase();

        if (savescore.equalsIgnoreCase("y") || savescore.equalsIgnoreCase("yes")) {
            highscore();
        }

        menu();
    }
}