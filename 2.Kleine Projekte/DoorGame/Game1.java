package DoorGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game1 {
    public static int again;
    public static int gamescore;
    public static int g;
    public static int k;
    public static int j;
    public static void game() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int score = 0;
        String door[] = {"[1]", "[2]", "[3]"};
        String start[] = {"Chose a door"};
        //dr = door, ipd = inputdoor
        String dr, eingabe; int random, ipd;
        //mh = menue or highscore
        String[] moh = {"1 - Menue", "2 - Highscore","0 - Exit"};

        //Game
        try {
            do {
                random = (int) (Math.random()*3+1);

                System.out.println(start[0]);
                System.out.println(door[0] + door[1] + door[2]);

                dr = br.readLine();
                ipd = Integer.parseInt(dr);

                score += 1;

            } while (random != ipd);

            System.out.println("Your Lost!");
            System.out.println("Your score is: " + score);
            System.out.println("Play again? yes = 1 / no = 2");
            eingabe = br.readLine();
            again = Integer.parseInt(eingabe);

            switch (again) {
                case 1: g +=1;
                break;
                case 2: System.out.println(moh[0] + "\n" + moh[1] + "\n" + moh[2]);
                        eingabe = br.readLine();
                        k = Integer.parseInt(eingabe);
                break;
                default: System.exit(0);
            }
            switch (k){
                case 1: j += 1; break;
                case 2: j += 2; break;
                default: System.exit(0);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        gamescore = score;
    }

}