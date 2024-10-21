package LEET_CODE.Java;

public class STRING_14 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int count = 0;

        for (int i = 0; i < strs[0].length(); i++) {
            count = 0;
            for (int j = 1; j < strs.length; j++) {
                if(i + 1 > strs[j].length()) {
                    return result;
                }

                String digit = strs[j].substring(i, i + 1);

                if (digit.equals(String.valueOf(strs[0].charAt(i)))) {
                    count += 1;
                }
            }

            if (count == strs.length - 1) {
                result += strs[0].charAt(i);
            } else {
                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        STRING_14 string_14 = new STRING_14();

        String[] testCaseOne = { "flower", "flow", "flight" };
        System.out.println(string_14.longestCommonPrefix(testCaseOne)); // expected: "fl"

        String[] testCaseTwo = { "dog","racecar","car" };
        System.out.println(string_14.longestCommonPrefix(testCaseTwo)); // expected: ""

        String[] testCaseThree = { "hello", "helmet", "hell" };
        System.out.println(string_14.longestCommonPrefix(testCaseThree)); // expected: "hel"

        String[] testCaseFour = { "ab", "a" };
        System.out.println(string_14.longestCommonPrefix(testCaseFour)); // expected: "hel"
    }
}
