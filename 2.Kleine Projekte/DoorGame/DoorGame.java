package DoorGame;

import java.io.*;

import static DoorGame.Highscore.*;
import static DoorGame.Menu.*;
import static DoorGame.Logic.*;

public class DoorGame {
    public static void main(String[] args) throws IOException {

        if (firstgame) {
            
            System.out.print(
            "\nWelcome to the Game of Doors." + 
            "\nIn this game you have to choose one of three doors." +
            "\n2 of them let you advance one dosn't." + 
            "\nGood luck and have fun. :)\n\n");
            firstgame = false;
        } 

        highscore();
        menu();
    }

}