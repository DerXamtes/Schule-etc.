import java.util.Scanner;

public class Verbrauch {
  public static void main(String[] args) {
    System.out.println("Willkommen beim Verbrauchsrechner");
    
    System.out.println("Bitte geben Sie die Strecke in Kilometer ein");
    Scanner km = new Scanner(System.in);
    double Strecke = km.nextDouble();
    
    System.out.println("Bitte geben Sie den Verbrauch in L");
    Scanner l = new Scanner(System.in);
    double Verbrauch = l.nextDouble();
    
    double Durchschnitt = Verbrauch/Strecke*100;
    System.out.println("Der Verbrauch auf 100km liegt bei =" +Durchschnitt+ "Liter");
  }
}
