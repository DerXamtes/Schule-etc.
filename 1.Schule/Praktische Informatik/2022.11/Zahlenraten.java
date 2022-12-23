import java.util.Scanner;

public class Zahlenraten{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zufallszahl = (int)(Math.random()*100 + 1);
        int ratezahl = 0;
        int counter = 0;

        while (zufallszahl != ratezahl){
            
            System.out.println("Bitte geben Sie Ihre Zahle ein (1-100)");
            ratezahl = sc.nextInt();
            counter++;

            if (ratezahl != zufallszahl) {

                if (zufallszahl < ratezahl){

                    System.out.println("Die Zufallszahl ist kleiner.");
                
                } else {

                    System.out.println("Die Zufallszahl ist grösser.");
                }
            
            } else {

                System.out.println("Zufallszahl: " + zufallszahl + " Rateversuche: " +counter);
            }
            
        }

        sc.close();
    }

}