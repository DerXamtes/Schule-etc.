import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Jahreszahl ein.");

        int jahreszahl = sc.nextInt();

        if (jahreszahl % 4 == 0) {

            if (jahreszahl % 100 == 0) {

                System.out.print("Kein Schaltjahr");

            } else {

                System.out.print("Schaltjahr");
            }
        
        } else {

            System.out.print("Kein Schaltjahr");
        }

        sc.close();
    }
    
}