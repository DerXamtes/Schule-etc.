import java.util.Scanner;

public class Kopfrechentrainer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, d = -1;

        System.out.println("Willkommen beim Kopfrechentrainer");
        
        do {

            a = (int)(Math.random()*200 + 1) - 99;

            b = (int)(Math.random()*200 + 1) - 99;

            System.out.print("(" + a + ")" + " + " + "(" + b + ") = ");

            while (!sc.hasNextInt()) {

                System.out.println("Bitte geben Sie eine Zahl ein.");
                sc.next();
            }
            
            c = sc.nextInt();
            d++;

        } while (c == a + b);

        if (d == 1) {
            
            System.out.println("Falsch! \nDu hast eine richtige Lösung erreicht. \nDanke fürs trainieren! :)");
    
        } else  {
            
            System.out.println("Falsch! \nDu hast " + d + " richtige Lösungen erreicht. \nDanke fürs trainieren! :)");
        }
        
        sc.close();
    }

}