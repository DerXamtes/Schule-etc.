import java.util.Scanner;

public class BMI_Check{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt sind Sie?");
        int a = sc.nextInt();

        System.out.println("Wie groß ist Ihr BMI?");
        double b = sc.nextDouble();

        if (a < 25) {

            if (b < 19) {

                System.out.print("Sie sind Untergewichtig.");
            
            }else if (b > 24) {

                System.out.print("Sie sind Übergewichtig.");

            } else {

                System.out.print("Sie sind Normalgewichtig.");
            }
        
        } else if (a > 64) {

            if (b < 24) {

                System.out.print("Sie sind Untergewichtig.");
        
            }else if (b > 29) {

                System.out.print("Sie sind Übergewichtig.");

            } else {

                System.out.print("Sie sind Normalgewichtig.");
            }
        
        } else {

            if (b < 22) {

                System.out.print("Sie sind Untergewichtig.");
            
            }else if (b > 27) {

                System.out.print("Sie sind Übergewichtig.");

            } else {

                System.out.print("Sie sind Normalgewichtig.");
            }
        
        }
    
        sc.close();
    }
    
}