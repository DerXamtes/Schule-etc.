import java.util.Scanner;

public class Clueless {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Alle Angaben bitte in Centimeter");
    
    System.out.print("a=");
    double a = sc.nextDouble();
    
    System.out.print("b=");
    double b = sc.nextDouble();
    
    double c = 2*a+2*b;
    System.out.println("Umfang:" + c);
    
    double d = a*b;
    System.out.println("Fläche:" + d);
    
  } 

} 

