package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;
import static DoorGame.Highscoremenu.*;

public class Menu {
    
    public static void menu() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfiletop3 = new BufferedReader(new FileReader(highscorefile));

        System.out.println("Menu\n[1] Play \n[2] Highscore \n[3] Exit");
        menuchoicestring = br.readLine();
        menuchoice = Integer.parseInt(menuchoicestring);

        switch (menuchoice) {

            case 1:
                
                logic();
                break;
            
            case 2:

                System.out.println("\nTop 3 Scores");
                
                for (highscore = 0; highscore < 3; highscore++) {

                    line = brfiletop3.readLine();

                    if (line != null){

                        System.out.println(line);
                    
                    } else {

                        System.out.println("No more scores available.");
                        highscore = 3;
                    }

                }

                System.out.println("\nMenu\n[1] Play \n[2] Top 10 scores \n[3] Exit"); 
                menuchoicestring = br.readLine();
                menuchoice = Integer.parseInt(menuchoicestring);

                switch (menuchoice) {

                    case 1:
                       
                        logic();
                        break;

                    case 2:

                        highscoremenu();
                        break;
                        
                    default:
                        
                        break;
                }

                break;

            default:
                
                break;
        }
        
        brfiletop3.close();
    }

}