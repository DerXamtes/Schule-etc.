import java.util.Scanner;

public class Clueless {
  
  public static void main(String[] args) {
    
    System.out.println("Alle Angaben bitte in Centimeter");
    
    System.out.print("a=");
    Scanner a = new Scanner (System.in);
    double erste_seite = a.nextDouble();
    
    System.out.print("b=");
    Scanner b = new Scanner (System.in);
    double zweite_seite = b.nextDouble();
    
    double c = 2*erste_seite+2*zweite_seite;
    System.out.println("Umfang:"+c);
    
    double d = erste_seite*zweite_seite;
    System.out.println("Flaeche:"+d);
    
  } 

} 

