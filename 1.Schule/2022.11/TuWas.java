public class TuWas {
    public static void main(String[] args)  {
    
        tuWas("Hurra, hurra, die Rita rennt!", 'r');
    }
        public static int tuWas(String s, char c) {
 
            s = s.toLowerCase();
            char zeichen;
            int zahl = 0;
        
        for(int i = 0; i < s.length(); i++) {
    
            zeichen = s.charAt(i);
        
            if(c == zeichen) {
        
                zahl++;
            }
 
        }
        
        return zahl;
    }

}