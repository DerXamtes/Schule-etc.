import java.util.Scanner;

/*
Willkommen beim Treibstoffverbrauchsrechner

*******************************************

Anzahl der LKWs eingeben eingeben: 1

Anzahl der Tage eingeben: 1

Der verbrauch beträgt: 157,5 Liter 
*/

public class Treibstoffverbrauch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl der LKWs ein");

        double a = sc.nextDouble();

        System.out.println("Bitte geben sie die Anzahl der Tage ein");

        double b = sc.nextDouble();

        System.out.print("Der Verbrauch liegt bei: " + a*b*4.5*35 + " Liter");

        sc.close();        

    }
}
