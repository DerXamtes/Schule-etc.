import java.util.Scanner;

public class Gerade_Ungerade{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihre Zahl ein.");

        int zahl = sc.nextInt();

        if ((zahl%2) == 0) {

            int a = zahl*2;

            System.out.print(a);
            
        } else {

            int b = zahl+1;

            System.out.print(b);
            
        }

     sc.close();
        
    }

}