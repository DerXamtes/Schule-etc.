import java.util.Scanner;

public class Freibad {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt ist die Person?");
        int a = sc.nextInt();

        if (a <= 3) {

            System.out.print("Der Eintritt ist frei.");
        
        } else if (a > 65 || a < 12) {

            System.out.print("Der Eintriit kostet: 2,50.");
        
        } else {

            System.out.print("Der Eintritt kostet: 5,00.");
        }

        sc.close();
    }
    
}