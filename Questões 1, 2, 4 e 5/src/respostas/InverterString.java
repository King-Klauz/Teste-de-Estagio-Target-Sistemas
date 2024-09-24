package respostas;

public class InverterString {

    public static String inverterString(String str) {
      
        char[] charArray = str.toCharArray();
        String invertedString = "";
        
        for (int i = charArray.length - 1; i >= 0; i--) {
            invertedString += charArray[i];
        }
        
        return invertedString;
    }

}
