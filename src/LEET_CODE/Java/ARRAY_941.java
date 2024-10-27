package LEET_CODE.Java;

public class ARRAY_941 {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        int mountainPeak = -1;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > arr[i + 1]) && i != 0) {
                mountainPeak = arr[i];
            }

            if (mountainPeak == -1) {
                if (arr[i] >= arr[i + 1]) {
                    return false;
                }
            } else {
                if (arr[i] <= arr[i + 1]) {
                    return false;
                }
            }
        }

        // It donot have strictly decreasing
        if(mountainPeak == -1) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        ARRAY_941 array_941 = new ARRAY_941();

        int[] testCaseOne = { 2, 1 };
        System.out.println("Result One: " + array_941.validMountainArray(testCaseOne));

        int[] testCaseTwo = { 3, 5, 5 };
        System.out.println("Result Two: " + array_941.validMountainArray(testCaseTwo));

        int[] testCaseThree = { 0, 3, 2, 1 };
        System.out.println("Result Three: " + array_941.validMountainArray(testCaseThree));

        int[] testCaseFour = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println("Result Four: " + array_941.validMountainArray(testCaseFour));
    }
}
