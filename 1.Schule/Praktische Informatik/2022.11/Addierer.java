import java.util.Scanner;

public class Addierer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double ergebnis = 0;
        double eingabe = 0;

        do {
            
            System.out.println("Bitte geben sie die nächste Zahl ein oder um das Programm zu beenden: 0.");
            eingabe = sc.nextDouble();
            ergebnis = ergebnis + eingabe;
        
        } while (eingabe != 0);

        System.out.println(ergebnis);

        sc.close();       
    }

}