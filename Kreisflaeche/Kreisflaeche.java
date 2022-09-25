import java.util.Scanner;

public class Kreisflaeche {
  
  public static void main(String[] args) {
    
    System.out.print("Bitte geben Sie den Radius in Centimeter ein: ");
    Scanner cm = new Scanner(System.in);
    double Radius = cm.nextDouble();
    
    double Flaeche = Radius*Radius*3.14;
    System.out.print("Die Flaeche betraegt "+Flaeche+ "cm2");
  } 
} 
