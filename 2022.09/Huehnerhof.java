import java.util.Scanner;;

public class Huehnerhof {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben sie die anzahl der Hühner ein.");

        double a = sc.nextDouble();

        System.out.println("Bitte geben sie die Anzahl der Tage ein");

        Double b = sc.nextDouble();

        System.out.println(a + " Hühner legen an " + b + " Tagen: " + a*b*5.6/7 + " Eier.");
        System.out.println("Dafür brauchen sie " + a*b*130/1000 + " Kilo Futter");

        sc.close();
        
    }
    
}
