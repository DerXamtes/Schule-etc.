import java.util.Scanner;

public class Fakultaet {
     public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib Fak");

        int a;
        int faktulat = 1;
        int b = sc.nextInt(); 
        sc.close();
    
        for(a = 1 ; a <= b ; a++) {
             
            faktulat = faktulat * a;
        }
        
        System.out.println("Fak Ju: " + faktulat);
    }
       
}