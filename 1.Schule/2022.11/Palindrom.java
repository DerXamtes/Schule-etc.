import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String trow = "";
    System.out.println("Geben Sie ein Wort ein.");
    String wort = sc.nextLine();
    int counter = wort.length();

    while (counter > 0) {

        char a = wort.charAt(counter - 1);
        trow = trow + a;
        counter--;
    }
    
    boolean check = wort.equalsIgnoreCase(trow);

    System.out.println(trow + '\n' + check);

    sc.close();
    }

}