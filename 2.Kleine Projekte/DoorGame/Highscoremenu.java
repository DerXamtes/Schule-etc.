package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;
import static DoorGame.Menu.*;
import static DoorGame.Highscore.*;

public class Highscoremenu {

    public static void highscoremenu() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfile = new BufferedReader(new FileReader(highscorefile));
                            
        System.out.println("\nTop 10 Scores");

        try {
            
            for (highscore = 0; highscore < 10; highscore++) {

                line = brfile.readLine();
                
                if (line != null) {

                    System.out.println(line);
            
                } else {

                    System.out.println("No more scores available");
                    highscore = 10;
                }

            }

        } catch (IOException e) {
            
            e.printStackTrace();
        }  

        System.out.println("\nDo you want to delete all scores? (y/n)");
        delscores = br.readLine().toLowerCase();
        System.out.println();

        switch (delscores) {

            case "y" : case "yes" :
                    
                delete = true;
                savescore = "no";
                highscore();
                menu();
                break;

            default:
                
                menu();
                break;
        }

        brfile.close();
    }

}