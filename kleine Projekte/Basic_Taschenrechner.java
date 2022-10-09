import java.util.Scanner;

public class Basic_Taschenrechner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welche Rechenoperation wollen sie ausführen? (plus/minus/mal/geteilt)");

        String Operation = sc.nextLine();

        System.out.println("Was ist die erste Zahl?");
        double a = sc.nextDouble();

        System.out.println("Was ist die zweite zahl?");
        double b = sc.nextDouble();

        if (Operation.equals("plus")) {

            System.out.print("Das Ergebniss ist: " + (a + b));            
        }
        
        if (Operation.equals("minus")) {

            System.out.print("Das Ergebniss ist: " + (a - b));   
        }

        if (Operation.equals("mal")){

            System.out.print("Das Ergebniss ist: " + (a * b));   
        }

        if (Operation.equals("geteilt")){
            
            System.out.print("Das Ergebniss ist: " + (a / b));   
        }

        sc.close();
        
    }

}