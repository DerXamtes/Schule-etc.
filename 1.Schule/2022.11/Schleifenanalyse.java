import java.util.Scanner;

public class Schleifenanalyse{
    public static void main(String[] args) {

        int x, y;
        Scanner sc = new Scanner(System.in);
    
        x = sc.nextInt(); 
        y = sc.nextInt(); 

        for (int i = 0; i < y; i++) {
        
            x=x+1;
        }
        
        System.out.print(x);
        sc.close();
    }

}

//Er addiert zu einem Wert so oft 1, biss die Anzahl der Additionen, dem zweitem Wert entsprechen.