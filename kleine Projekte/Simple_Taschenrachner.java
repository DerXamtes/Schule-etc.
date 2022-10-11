import java.util.Scanner;

public class Simple_Taschenrachner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie den Rechenoperator (plus/minus/mal/geteilt) an den Sie verwenden wollen.");
        String ab = sc.nextLine();
        String Operation = ab.toLowerCase();

        while(true){
            
            System.out.println("Bitte geben Sie die erste zahl ein.");
            while (!sc.hasNextDouble()) {
            
                System.out.println("Bitte geben Sie eine zahl ein. ");
                sc.nextLine();    
            }
              
                Double a = sc.nextDouble();

            System.out.println("Bitte geben Sie die zweite zahl ein.");
            while (!sc.hasNextDouble()) {
            
                System.out.println("Bitte geben Sie eine zahl ein. ");
                sc.nextLine();   
            }
              
                Double b = sc.nextDouble();
            
            if (Operation.equals("plus")) {

                System.out.println("Das ergebnis ist: " + (a + b));
            
            } else if (Operation.equals("minus")) {

                System.out.println("Das Ergebnisist:" + (a-b));
            
            } else if (Operation.equals("mal")) {

                System.out.println("Das ergebnis ist: " + (a * b));
            
            } else if (Operation.equals("geteilt")) {

                System.out.println("Das Ergebnisist:" + (a/b));
            
            } else {
                System.out.println("falscher Rechenoperator");
            }
                    
            System.out.println("Um noch eine Rechnung zu rechnen geben Sie den gewünschten Operator (plus/minus/mal/geteilt) ein.");
            System.out.println("Um den Taschenrechner zu Stoppen geben Sie Stopp ein");
            ab = sc.next();
            Operation = ab.toLowerCase();

            if (Operation.equals("stopp")){
                    
                System.out.println("Danke für's verwendern des Taschenrechners. :)");
                break;
            }
                
        }    
        
    sc.close();
        
    }

}