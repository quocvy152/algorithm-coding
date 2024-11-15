package LEET_CODE.Java;

import java.util.HashMap;

public class ARRAY_219 {
    // // Solution 1
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     if(nums.length == 0 || k <= 0) {
    //         return false;
    //     }

    //     for(int i = 0; i < nums.length - 1; i++) {
    //         for(int j = i + 1; j < nums.length; j++) {
    //             if((nums[i] == nums[j]) && Math.abs(i - j) <= k) {
    //                 return true;
    //             }
    //         }
    //     }

    //     return false;
    // }

    // Solution 2
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length == 0 || k <= 0) {
            return false;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                if(Math.abs(map.get(nums[i]) - i) <= k) {
                    return true;
                } else {
                    map.put(nums[i], i);
                }
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ARRAY_219 array_219 = new ARRAY_219();

        int[] testCaseOne = { 1, 2, 3, 1 };
        System.out.println("Result One: " + array_219.containsNearbyDuplicate(testCaseOne, 3));

        int[] testCaseTwo = { 1, 0, 1, 1 };
        System.out.println("Result Two: " + array_219.containsNearbyDuplicate(testCaseTwo, 1));

        int[] testCaseThree = { 1, 2, 3, 1, 2, 3 };
        System.out.println("Result Three: " + array_219.containsNearbyDuplicate(testCaseThree, 2));
    }
}
