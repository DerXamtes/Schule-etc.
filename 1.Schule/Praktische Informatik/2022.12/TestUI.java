public class TestUI {
    public static int roemischNachArab (String roem) {

        int arab = 0;
        
        for (int i = 0; i < roem.length(); i++) {

            char zeichen = roem.charAt(i);

            switch (zeichen) {

                case 'I': arab += 1; break;
                case 'V': arab += 5; break;
                case 'X': arab += 10; break;
                case 'L': arab += 50; break;
                case 'C': arab += 100; break;
                case 'D': arab += 500; break;
                case 'M': arab += 1000; break;
                
                default: return -1;
            }    
        }
        
        return arab;
    } 

    public static void main (String[] args) {

        System.out.println(roemischNachArab("XLVIIII"));
    }
}