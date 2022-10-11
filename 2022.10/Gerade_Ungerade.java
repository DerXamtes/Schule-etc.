import java.util.Scanner;

public class Gerade_Ungerade{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre Zahl ein.");

        int zahl = sc.nextInt();

        if ((zahl%2) == 0) {

            System.out.print("Die Zahl ist gerade.");
            
        } else {

            System.out.print("Die zahl ist ungerade.");
            
        }

     sc.close();
        
    }

}