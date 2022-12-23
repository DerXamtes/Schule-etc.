import java.util.Scanner;

public class Taxiunternehmen {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double g1, g2, km1, km2, s = 1, a1, a2;

        System.out.println("Bitte geben Sie die Grundgebühr des ersten Unternehmens in Euro an.");
        
        while (!sc.hasNextDouble()) {

            System.out.println("Bitte geben Sie eine Zahl ein.");
            sc.nextLine();
        }

        g1 = sc.nextDouble();

        System.out.println("Bitte geben Sie die Kosten pro Kilometer in Euro ein.");

        while (!sc.hasNextDouble()) {

            System.out.println("Bitte geben Sie eine Zahl ein.");
            sc.nextLine();
        }

        km1 = sc.nextDouble();

        a1 = g1+km1*s;

               System.out.println("Bitte geben Sie die Grundgebühr des zweiten Unternehmens in Euro an.");
        
        while (!sc.hasNextDouble()) {

            System.out.println("Bitte geben Sie eine Zahl ein.");
            sc.nextLine();
        }

        g2 = sc.nextDouble();

        System.out.println("Bitte geben Sie die Kosten pro Kilometer in Euro ein.");

        while (!sc.hasNextDouble()) {

            System.out.println("Bitte geben Sie eine Zahl ein.");
            sc.nextLine();
        }

        km2 = sc.nextDouble();

        a2 = g2+km2;

        System.out.println("[Kilometer][Unternehmen 1][Unternehmen 2]");

        while (s < 10) {

            System.out.println("[   " + s + "   ][     "+ a1 + "    ][     " + a2 + "    ]");

            s++;
            a1 = a1 + km1;
            a2 = a2 + km2;
        }

        s++;
        System.out.println("[  " + s + "   ][     "+ a1 + "    ][     " + a2 + "    ]");

    sc.close();
    }

}