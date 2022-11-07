import java.util.Scanner;

public class DoorGame {
    public static void main (String []args) {

        Scanner sc = new Scanner(System.in);

        int dead = 0;
        int door;
        int random;
        int score = 0;

        System.out.println("Welcome to the Door Game!" + 
                            "\nTo choose a door type 1,2 or 3." + 
                            "\n[1][2][3)");

        while (dead == 0) {
            
            door = sc.nextInt();

            while (door > 3 || door < 1) {

                System.out.println("Please enter a number between 1 and 3.");
                door = sc.nextInt();
            }

            random =  (int)(Math.random()*3 + 1);

            if (door != random) {

                System.out.println("To choose the next door type 1,2 or 3" + 
                "\n[1][2][3]");

                score++;
            
            } else {

                System.out.println("Game Over!" + 
                                    "\nYour score is: " + score);

                dead++;
            }
        
        }

        sc.close();
    }

}