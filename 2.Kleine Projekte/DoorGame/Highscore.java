package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Highscore {

    public static void highscore() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
      
            File Highscore = new File("2.Kleine Projekte/DoorGame/Highscore.txt");
      
            if (Highscore.createNewFile()) {} 
    
        } catch (IOException e) {
    
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //sort scores from top to bottom by score and delete everything after line 10

        if (savescore.equals("y") || savescore.equals("yes")) {

            System.out.println("Please enter your name.");
            name = br.readLine();
            System.out.println("Highscore is wip.");
            //write score and name to file (score "by" name)
            //sort file again and delte everything after line 10
        }
    
    }

}