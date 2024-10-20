package LEET_CODE.Java;
import java.util.HashMap;

public class ARRAY_217 {
    // // FAILED: case have many element in nums
    // public boolean containsDuplicate(int[] nums) {
    //     ArrayList<Integer> list = new ArrayList<>();

    //     for(int i = 0; i < nums.length; i++) {
    //         if(list.contains(nums[i])) {
    //             return true;
    //         }

    //         list.add(nums[i]);
    //     }

    //     return false;
    // }

    // SOLUTION 2: like solution 1, but it using HashMap, and problem solved
    // 11ms Beats 73.68%
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }

            map.put(nums[i], 1);
        }

        return false;
    }

    // // SOLUTION: 3 
    // // 21 ms Beats 9.78%
    // public boolean containsDuplicate(int[] nums) {
    //     Arrays.sort(nums);

    //     for(int i = 0; i < nums.length - 1; i++) {
    //         if(nums[i] == nums[i + 1]) {
    //             return true;
    //         }
    //     }

    //     return false;
    // }

    public static void main(String[] args) {
        ARRAY_217 array_217 = new ARRAY_217();

        int[] testCaseOne = { 1, 2, 3, 1 };
        System.out.println(array_217.containsDuplicate(testCaseOne));

        int[] testCaseTwo = { 1, 2, 3, 4 };
        System.out.println(array_217.containsDuplicate(testCaseTwo));

        int[] testCaseThree = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(array_217.containsDuplicate(testCaseThree));
    }
}
