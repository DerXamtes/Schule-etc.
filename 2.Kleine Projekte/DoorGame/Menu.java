package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;

public class Menu {
    
    public static void menu() throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        FileReader fr = new FileReader("2.Kleine Projekte/DoorGame/Highscore.txt");
        BufferedReader brfile = new BufferedReader(fr);

        while (firstgame) {
            
            System.out.print(
            "\nWelcome to the Game of Doors." + 
            "\nIn this game you have to choose one of three doors." +
            "\n2 of them let you advance one dosn't." + 
            "\nGood luck and have fun. :)\n\n");
            firstgame = false;
        } 

        System.out.println("Menu\n[1] Play \n[2] Highscore \n[3] Exit");
        menuchoicestring = br.readLine();
        menuchoice = Integer.parseInt(menuchoicestring);

        switch (menuchoice) {

            case 1:
                
                logic();
                break;
            
            case 2:

                System.out.println("\nTop 3 Scores");
                
                for (int i = 0; i < 3; i++) {

                    String line = brfile.readLine();
                    System.out.println(line);
                }

                brfile.close();
            
                System.out.println("\nMenu\n[1] Play \n[2] Exit"); 
                menuchoicestring = br.readLine();
                menuchoice = Integer.parseInt(menuchoicestring);

                switch (menuchoice) {

                    case 1:
                       
                        logic();
                        break;

                    default:
                        
                        System.out.println("Bye");
                        break;
                }
                
                break;

            default:
                
                System.out.println("Bye");
                break;
        }
    
    }

}