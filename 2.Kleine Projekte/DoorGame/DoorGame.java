package DoorGame;

import java.io.*;
import java.util.Scanner;

public class DoorGame {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        String again , save, highscore, name; 

        int score = 0, random, door, menu;

        System.out.println("Welcome to the Door Game! \n[1]Start \n[2]Highscore \n[3]Exit");

        while (!sc.hasNextInt()) {
            
            System.out.println("Please enter a number between 1 and 3.");
            sc.nextLine();
        }

        menu = sc.nextInt();

        while (menu < 1 || menu > 3) {

            System.out.println("Please enter a number between 1 and 3");
            menu = sc.nextInt();
        }

        switch (menu) {

            case 1 : break;
            case 2 : 
            
                System.out.println("Highscore is wip."); 
                System.out.println("Menu \n[1]Start \n[3]Exit");
                menu = sc.nextInt();                
                break;

            default : System.exit(0); break;
        }        

        if (menu == 3) {

            System.out.println("Bye.");
        }

        while (menu == 1) {

            System.out.println("To choose a door type 1,2 or 3.\n[1][2][3]");
            
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

                System.out.println("Game Over! \nYour score is: " + score);

                System.out.println("Do you want to save your score? (y/n)");

                save = sc.next();
                save = save.toLowerCase();

                switch (save) {

                    case "y" : case "yes" : System.out.println("What is your name?");
                                            name = sc.next();
                        try {
                    
                            FileWriter writer = new FileWriter("Highscore.txt");
                            writer.append(score + " by " + name);
                            writer.close();
                    
                        } catch (IOException ioe) {
                    
                        System.err.println(ioe);
                    }
                
                }

                System.out.println("Do you want to view your Highscore? (y/n)");
                highscore = sc.next();

                switch (highscore) {

                    case "y" : case "yes" :
                        System.out.println("Highscore is wip.");
                        break;

                    default: break;
                }
                
                System.out.println("Do you want to play again? (y/n)");
                again = sc.next(); 

                score = 0;

                switch (again) {

                    case "y" : case "yes" :
                        menu = 1;
                        break;
   
                    default : System.out.println("Thank you for playing! :)"); System.exit(0); break;
                }

            }
        
        }

        sc.close();
    }

}