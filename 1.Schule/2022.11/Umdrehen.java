import java.util.Scanner;

public class Umdrehen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int counter = s.length();

        while (counter > 0) {

            System.out.print(s.charAt(counter - 1));
            counter--;
        }
        System.out.println();

    }

}