import java.util.Scanner;

public class EsWerdeLicht {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Ist die Lampe angeschlossen?");
        boolean Strom = sc.nextBoolean();

        System.out.println("Ist der Schalter an?");
        boolean Schalter = sc.nextBoolean();

        if (Strom && Schalter) {

            Boolean Licht = true; 
            System.out.print(Licht);
        }

        sc.close();
    }
}