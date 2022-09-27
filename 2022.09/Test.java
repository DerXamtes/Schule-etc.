import java.util.Scanner;

public class Test{

  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.println("Hallo!");

    while(true) {

      double a = sc.nextDouble();

        if (a >= 1) {

          System.out.println(a);

        } else {

          break;

      }

    }

    sc.close();
    
  }
}