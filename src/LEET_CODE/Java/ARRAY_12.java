package LEET_CODE.Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class ARRAY_12 {
    public String intToRoman(int num) {
        String result = "";

        Map<Integer, String> romanMap = new LinkedHashMap<>();

        romanMap.put(1000, "M");
        romanMap.put(500, "D");
        romanMap.put(100, "C");
        romanMap.put(50, "L");
        romanMap.put(10, "X");
        romanMap.put(5, "V");
        romanMap.put(1, "I");

        int count = 0;
        while(num > 0) {
            int digit = num % 10;
            int value = (int)(digit * Math.pow(10, count));
            
            // Specical case use minus mode
            if(digit == 4 || digit == 9) {
                if(value != 0) {
                    for(Map.Entry<Integer, String> entry : romanMap.entrySet()) {
                        if(value <= 0) break;
    
                        int remainValue = value - entry.getKey();
                        if(remainValue < 0 && (remainValue == -1 || remainValue == -10 || remainValue == -100)) {
                            result = romanMap.get(Math.abs(remainValue)) + romanMap.get(value - remainValue) + result;
                            value -= entry.getKey();
                        }
                    }
                }
            } else {
                if(value != 0) {
                    Boolean isCalculateInRemainValue = false;
                    String strTemp = "";

                    for(Map.Entry<Integer, String> entry : romanMap.entrySet()) {
                        if(value == 0) break;
    
                        if(value - entry.getKey() >= 0) {
                            if(isCalculateInRemainValue) {
                                strTemp = strTemp + entry.getValue();
                            } else {
                                strTemp = entry.getValue() + strTemp;
                            }

                            value -= entry.getKey();
                            if(value >= 0) 
                                isCalculateInRemainValue = true;

                            Boolean isStillLoopWithCurrentKey = (value - entry.getKey() >= 0) ? true : false;
                            if(isStillLoopWithCurrentKey) {
                                while(value - entry.getKey() >= 0) {
                                    strTemp = strTemp + entry.getValue();
                                    value -= entry.getKey();
                                }
                            }
                        }
                    }

                    if(strTemp != null) {
                        result = strTemp + result;
                    }
                }
            }

            num = num / 10;
            count++; 
        }

        return result;
    }

    public static void main(String[] args) {
        ARRAY_12 solution = new ARRAY_12();
        System.out.println("Result: " + solution.intToRoman(500)); // Expected: D
        System.out.println("ResultTwo: " + solution.intToRoman(550)); // Expected: DL
        System.out.println("ResultThree: " + solution.intToRoman(1550)); // Expected: MDL
        System.out.println("ResultFour: " + solution.intToRoman(3749)); // Expected: MMMDCCXLIX
        System.out.println("ResultFive: " + solution.intToRoman(58)); // Expected: LVIII
        System.out.println("ResultSix: " + solution.intToRoman(1994)); // Expected: MCMXCIV
    }
}