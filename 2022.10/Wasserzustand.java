import java.util.Scanner;

public class Wasserzustand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Temperatur hat das Wasser?");

        double Temperatur = sc.nextDouble();

        if (Temperatur < 0) {

            System.out.print("Das Wasser ist gefroren.");
        
        } if (Temperatur == 0) {

            System.out.print("Das Wasser könnte sowohl gefroren als auch flüssig sein.");
        
        } if (Temperatur > 0 && Temperatur < 100) {

            System.out.print("Das Wasser ist flüssig.");
          
        } if (Temperatur == 100) {

            System.out.print("Das Wasser könnte sowohl flüssig als auch gasförmig sein.");
        
        } if (Temperatur > 100) {

            System.out.print("Das Wasser ist gasförmig.");
        }

        sc.close();
        
    }

}