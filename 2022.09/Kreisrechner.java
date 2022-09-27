import java.util.Scanner;

public class Kreisrechner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie den Radius ein.");
        
        double a = sc.nextDouble();

        System.out.println("Der Durchmesser ist: " + 2*a);
        System.out.println("Die Kreisfläche ist: " + a*a*3.1416);
        System.out.println("Der Kreisumfang ist: " + 2*a*3.1416);

        sc.close();
        
    }
    
}
