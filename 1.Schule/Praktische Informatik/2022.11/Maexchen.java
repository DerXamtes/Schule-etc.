public class Maexchen {
    public static void main(String[] args) {

        double punkte = 0;
        double anzahlw = 0;
        double anzahlm = 0;

        while (punkte < 100000) {

            int a = (int)(Math.random()*6 +1);
            int b = (int)(Math.random()*6 +1);
            anzahlw++;

            if (a+b == 3) {

                punkte = punkte + 1000;
                anzahlm++;

            } else if (a == b) {

                punkte = punkte + 4*a;
                
            } else {

                if (a > b) {

                    punkte = punkte + 10 * a + b;
                    
                } else {

                    punkte = punkte + 10 * b + a; 
                }

            }
    
        }
        
        System.out.println("Punkte: " + punkte);
        System.out.println("Würfe: " + anzahlw);
        System.out.println("Mäxchen: " + anzahlm);
        System.out.println("Mäxchen in Prozent: " + anzahlm*100/anzahlw + "%");
        
        if (punkte == 100000) {
            
            System.out.println("Jackpot!");
        }

        if (punkte == 100069) {

            System.out.println("Nice");
        }

        if (punkte == 100420) {

            System.out.println("Funny Number! hahaha lmfao");
        }

    }

}