import java.util.Scanner;
import java.lang.Math;

public class Schwimmbad {
    public static void main(String[] args) {

        double kostenki = 4;
        double kostenew = 8;
        double kostenor;

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Erwachsene wollen baden?");
        int erwachsene = sc.nextInt();

        System.out.println("Wie viele Kinder wollen baden?");
        int kinder = sc.nextInt();

        System.out.println("Wie viele Stunden wollen alle baden?");
        int badezeit = sc.nextInt();

        System.out.println("Ist Zugang zur Therme erwünscht? (true/false)");
        boolean therme = sc.nextBoolean();

        if (badezeit <= 1.5) {

            kostenew = 5;
            kostenki = 2.5;
            
        } else {

            if (badezeit <=3) {

            kostenew = 5.8;
            kostenki = 2.9;
            
            }

        }

        if (therme){

            kostenor = (kinder*kostenki) + (erwachsene*kostenew) + (kinder + erwachsene)*2; 
        
        }else{

            kostenor = (kinder*kostenki) + (erwachsene*kostenew);

        }

        if (kinder+erwachsene < 4){

            System.out.print("Die Kosten betragen: " + Math.round(kostenor));
            
        }else{

            System.out.print("Die Kosten betragen: " + Math.round(kostenor*0.8));

        }

        sc.close();
        
    }
    
}