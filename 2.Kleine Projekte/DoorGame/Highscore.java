package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Highscore {

    public static void highscore() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            highscorefile.createNewFile();
    
        } catch (IOException e) {
    
            e.printStackTrace();
        }

        if (savescore.equals("y") || savescore.equals("yes")) {

            System.out.println("Please enter your name.");
            name = br.readLine();
                    
            try {
            
                FileWriter fwr = new FileWriter(highscorefile, true);

                fwr.write(score + " by " + name + System.lineSeparator());

                fwr.close();

            } catch (IOException e) {

                e.printStackTrace();
            }

        }
        //TODO sort scores from top to bottom by score and delete everything after line 10
    }

}