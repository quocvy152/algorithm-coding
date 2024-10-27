package LEET_CODE.Java;

public class ARRAY_896 {
    public boolean isMonotonic(int[] nums) {
        int direction = 0; // 1: ascending or -1: descending
        
        for(int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] != nums[i + 1])) {
                direction = nums[i] > nums[i + 1] ? -1 : 1;
                break;
            }
        }

        if (direction == 0) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (direction == 1) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            } else {
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ARRAY_896 array_896 = new ARRAY_896();

        int[] testCaseOne = { 1, 2, 2, 3 };
        System.out.println("Result One: " + array_896.isMonotonic(testCaseOne));

        int[] testCaseTwo = { 6, 5, 4, 4 };
        System.out.println("Result Two: " + array_896.isMonotonic(testCaseTwo));

        int[] testCaseThree = { 1, 3, 2 };
        System.out.println("Result Three: " + array_896.isMonotonic(testCaseThree));

        int[] testCaseFour = { 1, 1, 1 };
        System.out.println("Result Four: " + array_896.isMonotonic(testCaseFour));
    }
}
