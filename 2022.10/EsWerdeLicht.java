import java.util.Scanner;

public class EsWerdeLicht {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Ist die Lampe angeschlossen?");
        boolean strom = sc.nextBoolean();

        System.out.println("Ist der Schalter an?");
        boolean schalter = sc.nextBoolean();

        if (strom && schalter) {

            Boolean Licht = true; 
            System.out.print(Licht);
        }

        sc.close();
    }
    
}