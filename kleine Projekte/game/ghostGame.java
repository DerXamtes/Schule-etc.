package game;
import java.io.*;
import java.nio.CharBuffer;

public class ghostGame {
    public static void main (String []args) throws IOException {

        System.out.println("Welcome to Ghost Game");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String text[] = {"(1) (2) (3)"};
        System.out.println("Ghost Game");
        System.out.println("Through which door you want to go? 1, 2 or 3? ");
        
        int random, i = 1;
        int eingabe, score1 = 0, score = 0;

        do {
        
            random = (int) (Math.random() * 3 + 1);
            System.out.println(text[0]);
            eingabe = Integer.parseInt(br.readLine());
    
            if (eingabe != random){
        
                score= 1;
            }
        
        score1 = score1 + score;
        
        } while (eingabe != random);

        System.out.print("You Lost!" +
                "\nYour score is: " + score1);
        
        System.out.println("\nDo you want to add your highscore to the ranking? <y> for yes / <n> for no");
        
        String eingabe2 = br.readLine();
        
        if (eingabe2.equals("y")) {

            try {
               
                BufferedWriter bw = new BufferedWriter(new FileWriter("highscore.txt"));
                System.out.print("Your Name: ");
                String name = br.readLine();
                FileReader fr = new FileReader("highscore.txt");
                BufferedReader br2 = new BufferedReader(fr);
                String a = String.valueOf(br2.read(CharBuffer.allocate(0)));
                int b = Integer.parseInt(a);

                if (i == b) {

                    bw.write((i+1) +". Player: " + name + " Score: " + score1 + "\n");

                } else {

                    bw.write("1. Player: " + name + " Score: " + score1 + "\n");
                }

                bw.close();

            } catch (IOException e) {

                e.printStackTrace();
            }

        } else {

            System.out.print("Do you want to play again? <y>/<n> ");
        }

    }

}