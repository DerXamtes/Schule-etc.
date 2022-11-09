import java.util.Scanner;

public class Zahlenvergleich {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie lautet die erste zahl?");
        int a = sc.nextInt();

        System.out.println("wie lautet die zweite zahl?");
        int b = sc.nextInt();

        System.out.println("Vergleich:");
        System.out.println("1.Zahl: " + a);
        System.out.println("2.Zahl: " + b);
        
        if (a > b) {

            System.out.print("Groesserer Wert: " + a);
        
        }else {

            System.out.print("Groesserer Wert: " + b);
        }

        sc.close();
    }
    
}