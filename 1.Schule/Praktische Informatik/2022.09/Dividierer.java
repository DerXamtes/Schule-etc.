import java.util.Scanner;
import java.lang.Math;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Dividierer {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("#.#############");
      df.setRoundingMode(RoundingMode.DOWN);
      
      System.out.println("Willkommen beim Dividierer");    
      System.out.println("Bitte geben Sie eine Dividend >=1 ein. z.B.: 7,8");
    
      while (true){

        double a = sc.nextDouble();
        int b = (int)a;

          if (a >= 1) {
    
            System.out.println("Bitte geben Sie einen Divisor >=1 ein.");
            double c = sc.nextDouble();
            int d = (int) c;
        
            System.out.print("Das Ergebnis ist " + b/d + " Rest: " + Math.ceil(a%c*10)/10);
            System.out.print("Ohne Rest ist das Ergebnis: " + df.format(a/c)); 
            System.out.println();
            System.out.println("Um noch eine Aufgabe lösen zu lassen, geben Sie einen Divident >=1 ein.");
            System.out.println("Um das Programm zu schliesen geben Sie 0 ein.");

          } else {

            System.out.println("Danke für's Verwenden :)");
            break;
      
        }
    
      }
    
    sc.close();
  
  } 

}