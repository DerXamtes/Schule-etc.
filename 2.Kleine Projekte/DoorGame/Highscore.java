package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Highscore {

    public static void highscore() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
      
            File highscore = new File("2.Kleine Projekte/DoorGame/Highscore.txt");
      
            if (highscore.createNewFile()) {} 
    
        } catch (IOException e) {
    
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        if (savescore.equals("y") || savescore.equals("yes")) {

            System.out.println("Please enter your name.");
            name = br.readLine();
            //TODO write score and name to file in new line (score "by" name)
        }
        //TODO sort scores from top to bottom by score and delete everything after line 10
    }

}