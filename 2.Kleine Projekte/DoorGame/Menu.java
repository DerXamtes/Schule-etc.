package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;
import static DoorGame.Highscore.*;

public class Menu {

    public static void menu() throws IOException {
        BufferedReader bufferedreader= new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedreaderfile = new BufferedReader(new FileReader(highscorefile));
        BufferedReader bufferedreaderfile2 = new BufferedReader(new FileReader(highscorefile));

        score = 0;
        System.out.println("Menu\n[1] Play \n[2] Highscore \n[3] Exit");
        int menuchoice = Integer.parseInt(bufferedreader.readLine());

        try {
            switch (menuchoice) {
                case 1:
                    logic();
                    break;
                case 2:
                    System.out.println("\nTop 3 Scores");
                    String line;
                    int counter = 0;
                    while ((line = bufferedreaderfile.readLine()) != null && counter < 3) {
                        System.out.println(line);
                        counter++;
                    }
                    if (counter == 0) {
                        System.out.println("No scores available.");
                    } else if (counter < 3) {
                        System.out.println("No more scores available.");
                    }

                    System.out.println("\nMenu\n[1] Play \n[2] Top 10 scores \n[3] Exit");
                    menuchoice = Integer.parseInt(bufferedreader.readLine());

                    switch (menuchoice) {
                        case 1:
                            logic();
                            break;
                        case 2:
                            System.out.println("\nTop 10 Scores");
                            counter = 0;
                           
                            try {
                                while ((line = bufferedreaderfile2.readLine()) != null && counter < 10) {
                                    System.out.println(line);
                                    counter++;
                                }
                                if (counter == 0) {
                                    System.out.println("No scores available.");
                                } else if (counter < 10) {
                                    System.out.println("No more scores available");
                                }
                                System.out.println("\nDo you want to delete all scores? (y/n)");
                                String delscores = bufferedreader.readLine().toLowerCase();
                                System.out.println();
                                if (delscores.equalsIgnoreCase("y") || delscores.equalsIgnoreCase("yes")) {
                                    delete = true;
                                    savescore = "no";
                                    highscore();
                                }
                            } finally {
                                bufferedreaderfile2.close();
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }
        } finally {
            bufferedreader.close();
            bufferedreaderfile.close();
        }
    }
}