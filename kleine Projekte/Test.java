import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie den Rechenoperator (plus/minus/mal/geteilt) an den Sie verwenden wollen .");
        String Operation = sc.nextLine();

        while(true){
            
            System.out.println("Bitte geben Sie die erste zahl ein.");
            double a = sc.nextDouble();

            System.out.println("Bitte geben Sie die zweite zahl ein.");
            double b = sc.nextDouble();

                if (a != 0) {

                    if (Operation.equals("plus")){

                        System.out.println("Das ergebnis ist: " + (a + b));
                    }

                    if (Operation.equals("minus")){

                        System.out.println("Das Ergebnisist:" + (a-b));
                    }
                    
                    if (Operation.equals("mal")){

                        System.out.println("Das ergebnis ist: " + (a * b));
                    }

                    if (Operation.equals("geteilt")){

                        System.out.println("Das Ergebnisist:" + (a/b));
                    }
                    
                    System.out.println("Um noch eine Rechnung zu rechnen geben Sie den gewünschten Operator (plus/minus/mal/geteilt) ein.");
                    System.out.println("Um den Taschenrechner zu Stoppen geben Sie Stopp ein");
                    Operation = sc.next();
                }

            if (Operation.equals("Stopp")){
                    
                System.out.println("Danke für's verwendern des Taschenrechners. :)");
                break;
            }
                
        }    
        
    sc.close();
        
    }
}