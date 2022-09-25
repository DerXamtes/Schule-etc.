import java.util.Scanner;

public class Kreisflaeche {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Bitte geben Sie den Radius in Centimeter ein: ");
    double a = sc.nextDouble();
    
    double b = a*a*3.14;
    System.out.print("Die Fläche betraegt " + b + "cm2");

    sc.close();
  
  } 

} 
