import java.util.Scanner;
import java.lang.Math;

public class Huehnerhof_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl der Hühner ein. ");
       
        while (!sc.hasNextInt()) {
            
            System.out.println("Bitte geben Sie die Anzahl ohne nachkommastellen ein. ");
            sc.nextLine();
          
            }
          
            int a = sc.nextInt();

        System.out.println("Bitte geben Sie die Anzahl der Tage ein. ");
       
            while (!sc.hasNextInt()) {
                
                System.out.println("Bitte geben Sie die Anzahl ohne nachkommastellen ein. ");
                sc.nextLine();
              
                }
              
                int b = sc.nextInt();

        System.out.println(a + " Hühner legen an " + b + " Tagen ca.: " + Math.round(a*b*5.6/7) + " Eier.");
        System.out.println("Dafür brauchen sie " + a*b*130.0/1000 + " Kilo Futter");

        sc.close();

    }

}