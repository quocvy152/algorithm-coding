package LEET_CODE.Java;

public class ARRAY_04 {
    public static double calculateMedianValue(int[] array) {
        if(array.length % 2 != 0) {
            int medianIdx = array.length / 2;
            return array[medianIdx];
        } else {
            int middleIdx = array.length / 2;
            double medianValue = (array[middleIdx - 1] + array[middleIdx]) / 2.0;
            return medianValue;
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Both is empty array
        if(nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        // Just nums1 have value
        if(nums2.length == 0 && nums1.length != 0) {
            return calculateMedianValue(nums1);
        }

        // Just nums2 have value
        if(nums1.length == 0 && nums2.length != 0) {
            return calculateMedianValue(nums2);
        }

        // Both array have value
        // Step 1: Merge array
        int[] mergedArray = new int[nums1.length + nums2.length];
        for(int i = 0; i < nums1.length; i++) {
            mergedArray[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            mergedArray[nums1.length + i] = nums2[i];
        }

        // Step 2: Sort array
        for(int i = 0; i < mergedArray.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < mergedArray.length; j++) {
                if(mergedArray[j] < mergedArray[min]) {
                    min = j;
                }
            }
            int temp = mergedArray[i];
            mergedArray[i] = mergedArray[min];
            mergedArray[min] = temp;
        }

        return calculateMedianValue(mergedArray);
    }

    public static void main(String[] args) {
        int[] arrNums1TC1 = {1, 3};
        int[] arrNums2TC1 = {2};
        System.out.println("Result Test Case One: " + findMedianSortedArrays(arrNums1TC1, arrNums2TC1));

        int[] arrNums1TC2 = {1, 2};
        int[] arrNums2TC2 = {3, 4};
        System.out.println("Result Test Case Two: " + findMedianSortedArrays(arrNums1TC2, arrNums2TC2));

        int[] arrNums1TC3 = {1, 2, 3, 4};
        int[] arrNums2TC3 = {};
        System.out.println("Result Test Case Three: " + findMedianSortedArrays(arrNums1TC3, arrNums2TC3));
    }
}
