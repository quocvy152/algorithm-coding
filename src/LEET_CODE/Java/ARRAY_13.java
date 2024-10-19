package LEET_CODE.Java;
import java.util.LinkedHashMap;
import java.util.Map;

public class ARRAY_13 {
    public int romanToInt(String s) {
        int result = 0;
        int maxInteger = Integer.MAX_VALUE;
        Map<String, Integer> romanMap = new LinkedHashMap<>();

        romanMap.put("M", 1000);
        romanMap.put("D", 500);
        romanMap.put("C", 100);
        romanMap.put("L", 50);
        romanMap.put("X", 10);
        romanMap.put("V", 5);
        romanMap.put("I", 1);

        for(int i = s.length() - 1; i >= 0; i--) {
            String currentDigit = String.valueOf(s.charAt(i));
            int valueCurrentDigit = romanMap.get(currentDigit);

            int valuePreviousDigit;
            if(i > 0) {
                String previousDigit = String.valueOf(s.charAt(i - 1));
                valuePreviousDigit = romanMap.get(previousDigit);
            } else {
                valuePreviousDigit = maxInteger;
            }

            // Check current roman is minus mode
            if(valueCurrentDigit - valuePreviousDigit > 0) {
                result += (valueCurrentDigit - valuePreviousDigit);
                i--;
            } else {
                result += valueCurrentDigit;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ARRAY_13 solution = new ARRAY_13();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV")); // Expected result: 1994
    }
}