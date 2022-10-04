import java.util.Scanner;

public class Temperaturrechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Temperatur in Fahrenheit ein.");

        double a = sc.nextDouble();
        System.out.print(a + " Grad Fahrenheit entsprechen " +  (a-32)*5/9 + " Grad Celcius");

        sc.close();
    }

}