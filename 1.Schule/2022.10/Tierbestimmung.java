import java.util.Scanner;

public class Tierbestimmung {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Schulterhöhe (cm) hat das Tier?");

        Double höhe = sc.nextDouble();

        if (höhe <= 5) {

            System.out.print("Maus");
            
        } else {

            System.out.println("Kann das Tier bellen?");

            String bellen = sc.next();

            if (bellen == "ja") {

                System.out.print("Hund");
                
            } else {

                System.out.print("Katze");
                
            }
            
        }

    sc.close();
   
    }
    
}