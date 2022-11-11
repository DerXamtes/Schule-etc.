package Bundeswettbewerb_41;

import java.io.*;
import java.util.Scanner;

public class Reimerei {
    public static void main (String[]args) throws IOException {
        
        try {
            
            FileReader fr = new FileReader("C:\\Users\\ansor\\OneDrive\\Dokumente\\GitHub\\Privat\\2.Kleine Projekte\\Wörter\\Bundeswettbewerb_41\\reimerei3.txt");
            BufferedReader br = new BufferedReader(fr);

            String word = br.readLine();
            String[] liste = readFiles2("C:\\Users\\ansor\\OneDrive\\Dokumente\\GitHub\\Privat\\2.Kleine Projekte\\Bundeswettbewerb_41\\Wörter\\reimerei3.txt");
            String[] vokalgruppen ={"a","e","i","o","u","au","eu","ai","ei","ou","ee"};
            String bw1, bw2;
            String w1, w2;
            String str;
            
            int a = 0;
            int b = 1;
            int c = 0; 
            
            do {

                w1 = liste[a];
                w2 = liste[b];

                for (int i = 0; i < w1.length(); i++) {

                    for (int j = 0; j < w2.length(); j++) {

                        do {

                            bw1 = w1.substring(w1.length() - (i++));
                            bw2 = w2.substring(w2.length() - (j++));
                            str = w1;
                
                            for (c = 0; c < str.length(); c++) {
                                
                                if (str.charAt(c) >= 0);
                            }

                        } while (bw1.equals(bw2));

                    }

                }
                
                a++;
            
            } while(liste.length <= a);
            
            System.out.println(c);
        
        } catch (IOException e) {
        
            e.printStackTrace();
        }
    
    }
    private static String[] readFiles2(String s) {
        try {
            
            File f = new File(s);
            Scanner sc = new Scanner(f);
            int count = 0;
            
            while (sc.hasNextLine()) {
            
                count++;
                sc.nextLine();
            }
            
            String[] arr = new String[count];
            Scanner sc1 = new Scanner(f);
            
            for (int i = 0; i < arr.length; i++) {
                
                arr[i] = sc1.nextLine();
            }
            
            return arr;
        
        } catch (IOException e) {
        
            return null;
        }
    
    }

}