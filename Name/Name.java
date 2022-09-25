import java.util.Scanner;

public class Name {
  
  public static void main(String[] args) {
    
    System.out.println("Wie heist du?");
    
    Scanner s = new Scanner(System.in);
    
    String Name = s.next(); 
    
    System.out.println("Hallo "+Name+"!");
  }
  
}

