import java.util.Scanner;

public class Quersumme {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String number;
        int counter = 0, summe = 0, a;
        System.out.println("Bitte geben Sie ihre Zahl ein.");

        number = sc.nextLine();

        while (counter < number.length()) {

            a = number.charAt(counter);
            summe = summe + a - 48;
            counter++;
        }

        System.out.println(summe);
    
        sc.close();
    }

}