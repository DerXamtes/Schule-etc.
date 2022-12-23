import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Gewicht in Kilo ein");

        double a = sc.nextDouble();

        System.out.println("Bitte geben Sie Ihre Größe in Meter ein");

        double b = sc.nextDouble();

        System.out.println("Ihr BMI liegt bei: " + a/(b*b));

        sc.close();
        
    }

}