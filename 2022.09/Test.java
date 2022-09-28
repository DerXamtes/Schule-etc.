import java.util.Scanner;

public class Test {
    public static void main(String... args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int a;
        System.out.print("Enter number 1: ");
        while (true)
            try {
                a = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException nfe) {
                System.out.print("Try again: ");
            }

      sc.close();
    
    }

  }