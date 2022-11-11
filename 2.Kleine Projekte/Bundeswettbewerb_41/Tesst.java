package Bundeswettbewerb_41;

import java.io.*;

public class Tesst{
    public static void main (String[] args){

        String[] liste;
        int a = 0, b = 0, lines;

        while (a < 658) {

            try {

                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ansor\\OneDrive\\Dokumente\\GitHub\\Privat\\2.Kleine Projekte\\Bundeswettbewerb_41\\reimerei3.txt"));
                
                while (a == b) {

                    b = (int)(Math.random()*658 + 1);
                }
                
                liste = br.lines().toArray(String[]::new);
                    
                String w1 = liste[a];
                String w2 = liste[b];

                b = (int)(Math.random()*658 + 1);

                System.out.println(w1 + " " + w2);

                br.close();
                a++;      

            } catch (IOException e) {
            
                e.printStackTrace();
            }
        
        }
    
    }

}