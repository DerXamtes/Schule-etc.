import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Container {
    public static void main (String[] args) throws IOException {

        try {
            //datei auslesen
            FileReader fr = new FileReader("C:\\Users\\Maximilian\\OneDrive\\Dokumente\\GitHub\\Privat\\0.Bundeswettbewerb_41\\Container\\container4.txt");
            BufferedReader br = new BufferedReader(fr);
            //erste zeile in auslesen und in einem String speichern
            String c = br.readLine();
            int[] zahlen = readFiles("container4.txt");

            while (c != null){
                String[] str = c.split("\\s+");
                int ctn1 = Integer.parseInt(str[0]);
                int ctn2 = Integer.parseInt(str[1]);
                if (ctn1 < ctn2){
                    System.out.println(ctn2 + " " + ctn1);
                } else if (ctn1 > ctn2) {
                    System.out.println(ctn1 + " " + ctn2);
                } else if (ctn1 == ctn2) {
                    System.out.println(ctn1 + " " + ctn2);
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

            for (int i = 0; i < arr.length; i++){
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