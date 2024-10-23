package LEET_CODE.Java;

public class ARRAY_38 {
    public String countAndSay(int n) {
        if(n < 1) {
            return "";
        }

        if(n == 1) {
            return "1";
        }

        String currentRLE = "1";

        for(int i = 2; i <= n; i++) {
            int count = 0;
            String tempCurrentRLE = "";

            if(currentRLE.length() == 1) {
                tempCurrentRLE = "11";
            } else {
                for(int j = 0; j < currentRLE.length() - 1; j++) {
                    count += 1;

                    if(!String.valueOf(currentRLE.charAt(j)).equals(String.valueOf(currentRLE.charAt(j + 1)))) {
                        tempCurrentRLE += (String.valueOf(count) + String.valueOf(currentRLE.charAt(j)));
                        count = 0;
                    }

                    if(j + 1 == currentRLE.length() - 1) {
                        count += 1;
                        tempCurrentRLE += (String.valueOf(count) + String.valueOf(currentRLE.charAt(j + 1)));
                    }
                }
            }

            currentRLE = tempCurrentRLE;
            tempCurrentRLE = "";
        }

        return currentRLE;
    }

    public static void main(String[] args) {
        ARRAY_38 array_38 = new ARRAY_38();

        int testCaseOne = 1;
        System.out.println("Result One: " + array_38.countAndSay(testCaseOne)); // Expected: 1

        int testCaseTwo = 4;
        System.out.println("Result Two: " + array_38.countAndSay(testCaseTwo)); // Expected: 1211
    }
}
