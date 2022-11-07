public class Wuerfel{
    public static void main(String[] args) {
        
        int a;
        int b = 0;
        
        do {
            a = (int)(Math.random()*6 + 1);
            b++;
            
        } while (a != 6);

        System.out.println(b);        
    }

}