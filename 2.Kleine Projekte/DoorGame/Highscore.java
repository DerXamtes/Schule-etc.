package DoorGame;

import java.io.*;

public class Highscore {

    public static void highscore() {

        try {
      
            File Highscore = new File("Highscore.txt");
      
            if (Highscore.createNewFile()) {
            } 
    
        } catch (IOException e) {
    
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}