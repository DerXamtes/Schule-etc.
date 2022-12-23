import java.util.Scanner;

public class Encode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Geben Sie die zu verschlüsselnde Nachricht ein.");
        String message = sc.nextLine().toLowerCase()
        .replace("ß", "ss").replace("ä", "ae").replace("ö", "oe").replace("ü", "ue");  
        int counter = 0;

        while (counter < message.length()) {

            int x = message.charAt(counter);
            System.out.print(x - 96);
            counter++;
        }
        
        sc.close();
    }
    
}