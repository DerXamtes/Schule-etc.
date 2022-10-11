import java.util.Scanner;

public class Urlaubsanspruch {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben Sie Ihr Alter ein.");
        int age = sc.nextInt();

        System.out.println("Bitte geben Sie Ihr Behindertengrad in Prozent ein.");
        int prozent = sc.nextInt();

        System.out.println("Wie viel hJahre arbeiten Sie schon für den Betrieb?");
        int zu = sc.nextInt();

        int urlaubstage = 26;

        if (age < 18 || age > 60) {

            urlaubstage = 30;
        }
        
        if (prozent >= 50) {

            urlaubstage = urlaubstage + 5;
        }
        
        if (zu >= 10) {

            urlaubstage = urlaubstage + 2;
        }

        System.out.println(urlaubstage);

        sc.close();
    }
}
