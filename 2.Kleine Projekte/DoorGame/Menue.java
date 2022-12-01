package DoorGame;

import java.io.*;

public class Menue{
    public static int i = 0;
    public static void menu() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Welcome to the game!");
        System.out.println("Menue: " +
                "\n1 - Play" +
                "\n2 - Highscore List" +
                "\n0 - Exit");

        String eingabe1 = br.readLine();
        int eingabe = Integer.parseInt(eingabe1);


        switch (eingabe) {
            case 1: i +=1;
            break;
            case 2: i += 2;
            break;
            default: System.exit(0);
        }
 
    }

}