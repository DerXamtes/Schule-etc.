import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String trow = "";
    System.out.println("Geben Sie ein Wort ein.");
    String wort = sc.nextLine().toLowerCase();
    int counter = wort.length();

    while (counter > 0) {

        char a = wort.charAt(counter - 1);
        trow = trow + a;
        counter--;
    }
    
    if (wort.equals(trow)) {

        System.out.println(true);
    
    } else {

        System.out.println(false);
    }

    sc.close();
    }

}