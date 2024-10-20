package LEET_CODE.Java;

public class ARRAY_28 {
    // SOLUTION 1
    // public int strStr(String haystack, String needle) {
    //     int positionOccurrence = haystack.indexOf(needle);
    //     return positionOccurrence;
    // }

    // SOLUTION 2
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return -1;
        }

        int needleLength = needle.length();
        for(int i = 0; i < haystack.length(); i++) {
            if((haystack.length() - i) < needleLength) {
                return -1;
            }

            String strSlice = haystack.substring(i, i + needleLength);
            if(strSlice.equals(needle)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ARRAY_28 array_28 = new ARRAY_28();

        System.out.println("Res 1: " + array_28.strStr("sadbutsad", "sad"));
        System.out.println("Res 2: " + array_28.strStr("leetcode", "leeto"));
        System.out.println("Res 3: " + array_28.strStr("sadbutsad", "but"));
    }
}
