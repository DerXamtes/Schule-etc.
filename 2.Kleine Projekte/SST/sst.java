package SST;

import java.util.Scanner;

public class sst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String botchoice, userchoice, again;
        boolean play = true;
        int score = 0;

        while (play) {

            int random = (int)(Math.random()*3+1);
            System.out.println("Schere, Stein oder Papier?");
            
            userchoice = sc.nextLine().toLowerCase();

            while (!userchoice.equals("schere") && 
                   !userchoice.equals("stein") &&
                   !userchoice.equals("papier")) {

                System.out.println("Bitte gebe Schere, Stein oder Papier ein.");
                userchoice = sc.next().toLowerCase();
            }
            
            switch (random) {

                case 1: botchoice = "schere"; break;
                case 2: botchoice = "stein"; break;
                
                default: botchoice = "papier"; break;
            }

            if (userchoice.equals(botchoice)) {

                System.out.println("Unentschieden!\nDein Score ist: " + score);
            
            } else if ((userchoice.equals("schere") && botchoice.equals("papier")) ||
                        (userchoice.equals("stein") && botchoice.equals("schere")) ||
                        (userchoice.equals("papier") && botchoice.equals("stein"))) {

                score ++;
                System.out.println("Du hast gewonnen!\nDein score ist: " + score);                     
            
            } else {

                System.out.println("Du hast verloren!\nDein Score ist: " + score);
                score = 0;
            }

            System.out.println("Willst du nochmal spielen? \n(Ja/Nein)");
            again = sc.next().toLowerCase();

            switch (again) {

                case "j" : case "ja" : play = true; break;

                default: 
                System.out.println("Danke fürs Spielen! :)\nDein score ist: " + score); 
                System.exit(0); play = false; break;
            }

        }

        sc.close();
    }
    
}