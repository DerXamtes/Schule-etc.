package DoorGame;

import java.io.*;

import static DoorGame.Logic.*;
import static DoorGame.Highscore.*;

public class Menu {

    public static void menu() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfile = new BufferedReader(new FileReader(highscorefile));

        score = 0;
        System.out.println("Menu\n[1] Play \n[2] Highscore \n[3] Exit");
        int menuchoice = Integer.parseInt(br.readLine());

        try {
            switch (menuchoice) {
                case 1:
                    logic();
                    break;
                case 2:
                    System.out.println("\nTop 3 Scores");
                    String line;
                    int counter = 0;
                    while ((line = brfile.readLine()) != null && counter < 3) {
                        System.out.println(line);
                        counter++;
                    }
                    if (counter == 0) {
                        System.out.println("No scores available.");
                    } else if (counter < 3) {
                        System.out.println("No more scores available.");
                    }

                    System.out.println("\nMenu\n[1] Play \n[2] Top 10 scores \n[3] Exit");
                    menuchoice = Integer.parseInt(br.readLine());

                    switch (menuchoice) {
                        case 1:
                            logic();
                            break;
                        case 2:
                            System.out.println("\nTop 10 Scores");
                            counter = 0;
                            BufferedReader brfile2 = new BufferedReader(new FileReader(highscorefile));
                            try {
                                while ((line = brfile2.readLine()) != null && counter < 10) {
                                    System.out.println(line);
                                    counter++;
                                }
                                if (counter == 0) {
                                    System.out.println("No scores available.");
                                } else if (counter < 10) {
                                    System.out.println("No more scores available");
                                }
                                System.out.println("\nDo you want to delete all scores? (y/n)");
                                String delscores = br.readLine().toLowerCase();
                                System.out.println();
                                if (delscores.equalsIgnoreCase("y") || delscores.equalsIgnoreCase("yes")) {
                                    delete = true;
                                    savescore = "no";
                                    highscore();
                                }
                            } finally {
                                brfile2.close();
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }
        } finally {
            br.close();
            brfile.close();
        }
    }
}