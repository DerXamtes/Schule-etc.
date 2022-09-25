import java.util.Scanner;

import java.lang.Math;

public class Divisor {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bitte geben Sie den Dividend =/>1 ein. Beispiel: 7,8");
    double a = sc.nextDouble();
    int b = (int) a;
    
    System.out.println("Bitte geben Sie den Divisor =/>1 ein. Beispiel 3,5");
    double c = sc.nextDouble();
    int d = (int) c;
    
    double e = a%c*10;
    
    System.out.println("Das Ergebnis ist " + b/d + " Rest: " + Math.ceil(e)/10);
    System.out.println("Ohne Rest ist das Ergebnis: " + a/c); 
  } 

}
