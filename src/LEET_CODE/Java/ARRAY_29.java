package LEET_CODE.Java;

import java.util.Stack;

public class ARRAY_29 {
    // Step 1: Định nghĩa ra 2 array open và close bracket
    // Step 2: Chạy vòng lặp kiểm tra xem các ký tự liền kề có phải là một cặp không
    // Step 3: Nếu không phải thì bắt đầu lặp từ 2 đầu vào xem từng cặp có phải 1
    // cặp không
    // public boolean isValid(String s) {
    // if(s.length() % 2 != 0) {
    // return false;
    // }

    // Map<String, String> mapBracket = new LinkedHashMap<>();
    // mapBracket.put("(", ")");
    // mapBracket.put("{", "}");
    // mapBracket.put("[", "]");

    // Boolean isValidPairBracketString = true;

    // for(int i = 0; i < s.length() - 1; i += 2) {
    // String closeBracketValid = mapBracket.get(String.valueOf(s.charAt(i)));

    // if(!String.valueOf(s.charAt(i + 1)).equals(closeBracketValid)) {
    // isValidPairBracketString = false;
    // break;
    // }
    // }

    // if(isValidPairBracketString) {
    // return true;
    // }

    // for(int i = 0; i < s.length() / 2; i++) {
    // String closeBracketValid = mapBracket.get(String.valueOf(s.charAt(i)));

    // if(!String.valueOf(s.charAt(s.length() - i - 1)).equals(closeBracketValid)) {
    // return false;
    // }
    // }

    // return true;
    // }

    // // PASSED 91/100 CASE
    // public boolean isValid(String s) {
    // if(s.length() % 2 != 0) {
    // return false;
    // }

    // Map<String, String> mapBracket = new LinkedHashMap<>();
    // mapBracket.put("(", ")");
    // mapBracket.put("{", "}");
    // mapBracket.put("[", "]");

    // List<Integer> listItemApproved = new ArrayList<>();
    // Boolean isHavePair = false;

    // for(int i = 0; i < s.length() - 1; i ++) {
    // isHavePair = false;

    // if(listItemApproved.indexOf(i) >= 0) {
    // continue;
    // }

    // for(int j = i + 1; j < s.length(); j++) {
    // String closeBracketValid = mapBracket.get(String.valueOf(s.charAt(i)));

    // if(String.valueOf(s.charAt(j)).equals(closeBracketValid) && ((i + j + 1) % 2
    // == 0)) {
    // if((j - i > 1) && !isValid(s.substring(i + 1, j))) {
    // return false;
    // }

    // listItemApproved.add(j);
    // isHavePair = true;
    // break;
    // }
    // }

    // if(!isHavePair) {
    // return isHavePair;
    // }
    // }

    // return true;
    // }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ARRAY_29 array_29 = new ARRAY_29();

        String testCaseOne = "()[]{}";
        System.out.println("Result Case One: " + array_29.isValid(testCaseOne));

        String testCaseTwo = "()";
        System.out.println("Result Case Two: " + array_29.isValid(testCaseTwo));

        String testCaseThree = "(]";
        System.out.println("Result Case Three: " + array_29.isValid(testCaseThree));

        String testCaseFour = "([])";
        System.out.println("Result Case Four: " + array_29.isValid(testCaseFour));

        String testCaseFive = "[";
        System.out.println("Result Case Five: " + array_29.isValid(testCaseFive));

        String testCaseSix = "(([]){})";
        System.out.println("Result Case Six: " + array_29.isValid(testCaseSix));

        String testCaseSeven = "[({])}";
        System.out.println("Result Case Seven: " + array_29.isValid(testCaseSeven));

        String testCaseEight = "[({(())}[()])]";
        System.out.println("Result Case Eight: " + array_29.isValid(testCaseEight));
    }
}
