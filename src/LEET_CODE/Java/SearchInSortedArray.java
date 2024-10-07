package LEET_CODE.Java;

public class SearchInSortedArray {
    public static int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;

        for(int index = 0; index < nums.length; index++) {
            if(nums[index] == target) {
                return index;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] testCaseOne = {4,5,6,7,0,1,2};
        System.out.println("Result Test Case One: " + search(testCaseOne, 0));

        int[] testCaseTwo = {4,5,6,7,0,1,2};
        System.out.println("Result Test Case One: " + search(testCaseTwo, 3));
    }
}
