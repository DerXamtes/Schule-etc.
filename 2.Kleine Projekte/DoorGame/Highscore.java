package DoorGame;

import java.io.*;
import java.util.*;

import static DoorGame.Logic.*;
import static DoorGame.Menu.*;

public class Highscore {

    public static void highscore() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> lines = new ArrayList<>();

        try (BufferedReader brfile = new BufferedReader(new FileReader(highscorefile))) {
            String line;
            while ((line = brfile.readLine()) != null) {
                lines.add(line);
            }
        }

        if (savescore.equalsIgnoreCase("y") || savescore.equalsIgnoreCase("yes")) {
            System.out.println("Please enter your name.");
            String name = br.readLine();
            lines.add(score + " by " + name);
        }

        lines.sort(new Comparator<String>() {
            @Override
            public int compare(String line1, String line2) {
                int num1 = Integer.parseInt(line1.split(" ")[0]);
                int num2 = Integer.parseInt(line2.split(" ")[0]);
                return Integer.compare(num2, num1);
            }
        });

        if (delete) {
            lines.clear();
            delete = false;
            menu();
        }

        if (lines.size() > 10) {
            lines = lines.subList(0, 10);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(highscorefile))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}