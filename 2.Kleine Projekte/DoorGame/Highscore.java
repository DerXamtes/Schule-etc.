package DoorGame;

import java.io.*;
import java.util.*;

import static DoorGame.Logic.*;

public class Highscore {

    public static void highscore() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brfile = new BufferedReader(new FileReader(highscorefile));

        try {
            
            highscorefile.createNewFile();
    
        } catch (IOException e) {
    
            e.printStackTrace();
        }

        if (savescore.equals("y") || savescore.equals("yes")) {

            System.out.println("Please enter your name.");
            name = br.readLine();
                    
            try {
            
                FileWriter fwr = new FileWriter(highscorefile, true);

                fwr.write(score + " by " + name + System.lineSeparator());

                fwr.close();

            } catch (IOException e) {

                e.printStackTrace();
            }

        }
        
        List<String> lines = new ArrayList<>();
        
        try {
                
            while ((line = brfile.readLine()) != null) {
        
                lines.add(line);
            }
        
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        Collections.sort(lines, new Comparator<String>() {
            
            @Override
            
            public int compare(String line1, String line2) {
            
                int num1 = Integer.parseInt(line1.split(" ")[0]);
                int num2 = Integer.parseInt(line2.split(" ")[0]);
                return Integer.compare(num2, num1);
            }
        
        });

        if (delete) {

            lines = lines.subList(0, 0);
            delete = false;
        }

        if (lines.size() > 10) {

            lines = lines.subList(0, 10);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(highscorefile))) {
            
            for (String line : lines) {
            
                writer.write(line);
                writer.newLine();
            }
        
        } catch (IOException e) {
        
            e.printStackTrace();
        }
        
    }

}