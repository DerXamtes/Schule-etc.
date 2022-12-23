import java.util.Scanner;

public class Wasserzustand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Temperatur hat das Wasser?");

        double temperatur = sc.nextDouble();

        if (temperatur < 0) {

            System.out.print("Das Wasser ist gefroren.");
        
        } if (temperatur == 0) {

            System.out.print("Das Wasser könnte sowohl gefroren als auch flüssig sein.");
        
        } if (temperatur > 0 && temperatur < 100) {

            System.out.print("Das Wasser ist flüssig.");
          
        } if (temperatur == 100) {

            System.out.print("Das Wasser könnte sowohl flüssig als auch gasförmig sein.");
        
        } if (temperatur > 100) {

            System.out.print("Das Wasser ist gasförmig.");
        }

        sc.close();
        
    }

}