package codingClass.strings;

//import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class PinCodeSeparator {
    
    public static void main(String[] args) {
        String input = "Basavanagudi560004Begur560068"; // Example input
        String[] separatedInput = separatePinCodes(input);
        for (String s : separatedInput) {
            System.out.print(s);
        }
    }
    
    public static String[] separatePinCodes(String input) {
        ArrayList<String> separated = new ArrayList<>();
        String currentArea = "";
        String currentPinCode = "";
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c>='0' && c<=9) {
                currentPinCode += c;
            } else {
                if (!currentArea.equals("")) {
                    separated.add(currentArea + "  '---'  " + currentPinCode);
                }
                currentArea = "" + c;
                currentPinCode = "";
            }
        }
        separated.add(currentArea + " " + currentPinCode); // Add the last area and pin code pair
        
        return separated.toArray(new String[0]);
    }
}
