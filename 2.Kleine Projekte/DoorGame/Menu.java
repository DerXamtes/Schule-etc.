package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Menu {
    
    public static void menu() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfiletop3 = new BufferedReader(new FileReader(highscorefile));
        BufferedReader brfiletop10 = new BufferedReader(new FileReader(highscorefile));

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

                        System.out.println("\nTop 10 Scores");
                        
                        for (highscore = 0; highscore < 10; highscore++) {

                            line = brfiletop10.readLine();
                            
                            if (line != null) {
                            
                                System.out.println(line);
                        
                            } else {

                                System.out.println("No more scores available");
                                highscore = 10;
                            }
                        
                        }

                        System.out.println("\nDo you want to delete all scores? (y/n)");
                        delscores = br.readLine().toLowerCase();
                        System.out.println(" ");

                        switch (delscores) {

                        case "y" : case "yes" :

                            highscorefile.delete();
                            menu();
                            break;

                        default:

                            menu();
                            break;
                        }
                        
                    default:
                        
                        break;
                }

                break;

            default:
                
                break;
        }
        
        brfiletop3.close();
        brfiletop10.close();
    }

}