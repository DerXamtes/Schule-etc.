package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Menu {
    
    public static void menu() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfile = new BufferedReader(new FileReader("2.Kleine Projekte/DoorGame/Highscore.txt"));

        System.out.println("Menu\n[1] Play \n[2] Highscore \n[3] Exit");
        menuchoicestring = br.readLine();
        menuchoice = Integer.parseInt(menuchoicestring);

        switch (menuchoice) {

            case 1:
                
                logic();
                break;
            
            case 2:

                System.out.println("\nTop 3 Scores");
                
                for (highscore1 = 0; highscore1 < 3; highscore1++) {

                    line = brfile.readLine();
                    System.out.println(line);
                    //TODO if there are no entries display that there ar no entries
                }
            
                System.out.println("\nMenu\n[1] Play \n[2] Top 10 scores \n[3] Exit"); 
                menuchoicestring = br.readLine();
                menuchoice = Integer.parseInt(menuchoicestring);

                switch (menuchoice) {

                    case 1:
                       
                        logic();
                        break;

                    case 2:

                        System.out.println("\nTop 10 Scores");
                        for (highscore2 = 0; highscore2 < 10; highscore2++) {

                            line = brfile.readLine();
                            System.out.println(line);
                            //TODO if there are no entries display no entries
                        }
                        System.out.println();
                        menu();
                        break;

                    default:
                        
                        System.out.println("Bye");
                        break;
                }
                brfile.close();
                break;

            default:
                
                System.out.println("Bye");
                break;
        }
    
    }

}