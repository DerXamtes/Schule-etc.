package DoorGame.GLV;
//import menu class
import static DoorGame.GLV.Menue.*;
import static DoorGame.GLV.Game1.*;
import static DoorGame.GLV.Highscore.*;
// Kati wer hier
//import java library
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //using menu own menu class
        menu();
        // i for switch case operation in Menue
        if (i == 1) {
            game();
            //g for switch case operation in Game1
            //g = 1 is play again
            do {
                game();
            } while(g==1);
            //g = 2 is for back to menue
            if (g == 2) {

            }
        } else if (i == 2) {
            highscore();
        }

    }

}