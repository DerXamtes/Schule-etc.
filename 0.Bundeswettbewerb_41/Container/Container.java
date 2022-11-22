import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Container {
    public static void main (String[] args) throws IOException {

        try {
            
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Maximilian\\OneDrive\\Dokumente\\GitHub\\Privat\\0.Bundeswettbewerb_41\\Container\\Test.txt"));
            
            String c = br.readLine();
            int[] zahlen = readFiles("container4.txt");

            while (c != null){
                
                String[] str = c.split("\\s+");
                int a = Integer.parseInt(str[0]);
                int b = Integer.parseInt(str[1]);
                
                if (a < b) {
                    
                    System.out.println(b + " " + a);
                
                } else if (a > b) {
                    
                    System.out.println(a + " " + b);
                
                } else if (a == b) {
                    
                    System.out.println(a + " " + b);
                }
                
                c = br.readLine();
            }
            
            Arrays.sort(zahlen);
            System.out.println("Der sc " + zahlen[zahlen.length-1]);
            br.close();
        
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    
    }
    private static int[] readFiles(String s) {

        try {

            File f = new File(s);
            Scanner sc = new Scanner(f);
            int count = 0;

            while (sc.hasNextInt()) {

                count++;
                sc.nextInt();
            }

            int[] arr = new int[count];
            Scanner sc1 = new Scanner(f);

            for (int i = 0; i < arr.length; i++) {
        
                arr[i] = sc1.nextInt();

                sc.close();
                sc1.close();
            }
            return arr;
        
        } catch (IOException e){
        
            return null;
        }
    
    }

}