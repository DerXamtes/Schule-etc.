import java.util.Scanner;
import java.lang.Math;

public class Huehnerhof {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben sie die anzahl der Hühner ein.");

        int a = sc.nextInt();

        System.out.println("Bitte geben sie die Anzahl der Tage ein");

        int b = sc.nextInt();

        System.out.println(a + " Hühner legen an " + b + " Tagen ca.: " + Math.round(a*b*5.6/7) + " Eier.");
        System.out.print("Dafür brauchen sie " + a*b*130.0/1000 + " Kilo Futter");

        sc.close();
        
    }
    
}
