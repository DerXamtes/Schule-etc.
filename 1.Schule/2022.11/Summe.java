public class Summe {
    public static void main(String[] args) {

        int zahl = 0;
        int summe = 0;

        while (summe <= 100) {

            zahl = zahl+1;
            summe = summe+zahl;
        }

        System.out.println(zahl);
    }
}
