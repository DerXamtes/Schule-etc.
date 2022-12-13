public class RomanNumeralConverter {
  
  public static int convert(String romanNumeral) {
  
    int result = 0;
    String romanNumeralLowerCase = romanNumeral.toLowerCase();

    for (int i = 0; i < romanNumeralLowerCase.length(); i++) {
  
      char c = romanNumeralLowerCase.charAt(i);
      switch (c) {
        case 'i': result += 1;   break;
        case 'v': result += 5;   break;
        case 'x': result += 10;  break;
        case 'l': result += 50;  break;
        case 'c': result += 100; break;
        case 'd': result += 500; break;
        case 'm': result += 1000;break;
      
      }
    
    }

    return result;
  }

  public static void main(String[] args) {
    // Test the converter
    String[] testRomanNumerals = {"XXI", "IV", "MMVIII", "XLIX"};
    int[] expectedResults = {21, 4, 2008, 49};

    for (int i = 0; i < testRomanNumerals.length; i++) {
      int result = convert(testRomanNumerals[i]);
      System.out.println("Converting " + testRomanNumerals[i] + ": " + result + " (expected " + expectedResults[i] + ")");
    }
 
  }

}