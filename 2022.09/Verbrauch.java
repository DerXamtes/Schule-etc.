import java.util.Scanner;

public class Verbrauch {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Willkommen beim Verbrauchsrechner");
    
    System.out.println("Bitte geben Sie die Strecke in Kilometer ein");
    double a = sc.nextDouble();
    
    System.out.println("Bitte geben Sie den Verbrauch in L");
    double b = sc.nextDouble();
    
    double Durchschnitt = b/a*100;
    System.out.print("Der Verbrauch auf 100km liegt bei =" + Durchschnitt + "Liter");

    sc.close();
  
  }

}
