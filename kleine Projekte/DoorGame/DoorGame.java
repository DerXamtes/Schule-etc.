package DoorGame;

import java.util.Scanner;

public class DoorGame {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        String again;
        int menu;
        int door;
        int random;
        int score = 0;

        System.out.println("Welcome to the Door Game! \n[1]Start \n[2]Highscore \n[3]Exit");

        while (!sc.hasNextInt()) {
            
            System.out.println("Please enter a number between 1 and 3.");
            sc.nextLine();
        }

        menu = sc.nextInt();

        if (menu < 1 || menu > 3) {

            System.out.println("Please enter a number between 1 and 3");
            menu = sc.nextInt();
        }

        switch (menu) {

            case 1 : break;
            case 2 : System.out.println("Highscore is wip."); System.exit(0); break;
            default : System.out.println("Bye."); System.exit(0); break;
        }        

        System.out.println("To choose a door type 1,2 or 3.\n[1][2][3]");

        while (menu == 1) {
            
            while (!sc.hasNextInt()) {
        
                System.out.println("Please enter a number between 1 and 3.");
                sc.nextLine();    
            }

            door = sc.nextInt();

            while (door > 3 || door < 1) {

                System.out.println("Please enter a number between 1 and 3.");
                door = sc.nextInt();
            }

            random =  (int)(Math.random()*3 + 1);

            if (door != random) {

                System.out.println("To choose the next door type 1,2 or 3 \n[1][2][3]");

                score++;
            
            } else {

                System.out.println("Game Over! \nYour score is: " + score + "\nDo you want to play again? (y/n)");
                
                again = sc.next(); 
                again = again.toLowerCase();

                switch (again) {

                    case "y" : menu = 1; System.out.println("To choose a door type 1,2 or 3.\n[1][2][3]"); break;
                    case "yes" : menu = 1; System.out.println("To choose a door type 1,2 or 3.\n[1][2][3]"); break;
                    default : System.out.println("Thank you for playing! :)"); System.exit(0); break;
                }

            }
        
        }

        sc.close();
    }

}