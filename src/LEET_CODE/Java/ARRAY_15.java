package LEET_CODE.Java;

import java.util.ArrayList;
import java.util.List;

public class ARRAY_15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    int totalTriplet = nums[i] + nums[j] + nums[k];
                    Boolean isTripletDiff = (i != j) && (i != k) && (j != k);
                    Boolean isExistItem  = false;

                    if(isTripletDiff && totalTriplet == 0) {

                        if(isExistItem == false) {
                            List<Integer> listTemp = new ArrayList<>();

                            listTemp.add(nums[i]);
                            listTemp.add(nums[j]);
                            listTemp.add(nums[k]);

                            list.add(listTemp);
                        }
                    }
                }   
            }       
        }

        return list;
    }

    public static void main(String[] args) {
        
    }
}
