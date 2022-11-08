import java.util.Scanner;

public class geschachtelteSchleife {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Höhe der Form ein.");
        int a = sc.nextInt();
        int b;
        int c;

        System.out.println("Welche Form wollen Sie? \n[Quadrat] [Rechteck] [Dreieck]");
        String form = sc.next();
        form = form.toLowerCase();

        switch (form) {

            case "q" : case "quadrat" : 
            
                for (c = 0; c < a; c++) {
                    
                    for (b = 0; b < a; b++) {
                        
                        System.out.print("*");
                    }
                    
                    System.out.println();
                }
                
            break;

            case "r" : case "rechteck" : 

                System.out.println("Bitte geben Sie die Breite des Rechtecks ein.");
                int d = sc.nextInt();

                for (c = 0; c < a; c++) {
                    
                    for (b = 0; b < d; b++) {
                        
                        System.out.print("*");
                    }
                    
                    System.out.println();
                }
            break;

            case "d" : case "dreieck" :  
                
                for (c = 0 ; c < a; c++) {  
                    
                    for (b = a - c ; b > 1 ; b--) {  
                    
                        System.out.print(" ");   
                    }   
                    
                    for (b = 0 ; b <= c ; b++) {   
                    
                        System.out.print("* ");
                    }   
                
                System.out.println(); 
                }  
            break;

            default : System.out.println("Falsche Form"); System.exit(0); break;
       
        }

        sc.close();
    }

}