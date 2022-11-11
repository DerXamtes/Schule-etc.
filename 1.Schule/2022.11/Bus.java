import java.util.Scanner;

public class Bus {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int door, light, moving;

        System.out.println("Ist eine Tür offen? \n[1]Ja \n[2]Nein");
        door = sc.nextInt();

        if (door == 1) {

            light = 1;
            
            if (light == 1) {

                System.out.println("Arlamleuchte");
            }

            System.out.println("Bewegt sich der Bus? \n[1]Ja \n[2]Nein");

            moving = sc.nextInt();

            while (door == 1 && moving == 1) {

                System.out.println("ALARRRM!!!");
            }

        } 

        sc.close();
    }

}