import java.util.Scanner;

public class Clueless {  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bitte geben Sie die Breite und Länge ein");
    
    System.out.print("Breite = ");
    double a = sc.nextDouble();
    
    System.out.print("Länge = ");
    double b = sc.nextDouble();
    
    double c = 2*a+2*b;
    System.out.println("Umfang:" + c);
    
    double d = a*b;
    System.out.print("Fläche:" + d);
    
    sc.close();

  } 

} 