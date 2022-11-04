import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        double ergebnis = 0;

        System.out.println("Bitte geben Sie die erste zahl ein.");

            while (!sc.hasNextDouble()) {
        
                System.out.println("Bitte geben Sie eine zahl ein. ");
                sc.nextLine();    
            }

        do {

            Double a = sc.nextDouble();
            
            System.out.println("Bitte geben Sie die zweite zahl ein.");        

            while (!sc.hasNextDouble()) {
            
                System.out.println("Bitte geben Sie eine zahl ein. ");
                sc.nextLine();   
            }
            
                Double b = sc.nextDouble();

            System.out.println("Bitte geben Sie den Operator ein ( +,-,*,/ ).");

            String s = sc.next();
            char operator = s.charAt(0);

            switch (operator) {

                case '+' : ergebnis = a+b; break;
                case '-' : ergebnis = a-b; break;
                case '*' : ergebnis = a*b; break;
                case '/' : ergebnis = a/b; break;

                default: System.out.println("Falscher Operator");
            }

            try {

            if(ergebnis == Double.POSITIVE_INFINITY) {

                throw new ArithmeticException();

            } else {

                System.out.println("Das Ergebnis ist: " + ergebnis);
            }
            
            } catch (ArithmeticException e) {

                System.out.println("To Infinity and beyond!");
            }

            System.out.println("Um eine zweite Rechnug rechnen zu lassen, geben Sie die erste Zahl der nächsten rechnung ein.");              
            System.out.println("Um den Taschenrechenr zu schließen geben Sie Stopp ein.");

        } while (sc.hasNextDouble());

        sc.close();
    }

}