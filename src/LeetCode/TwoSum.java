package src.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

// hard code:
//    public int[] twoSum(int[] nums, int target) {
//        int[] results = new int[2];
//        for(int i =0;i<nums.length;i++){
//            for (int j=i+1;j<nums.length;j++){
//                if (nums[i]+nums[j]==target){
//                    results[0]=i;
//                    results[1]=j;
//                    System.out.println(Arrays.toString(results));
//                    return results;
//                }
//            }
//        }
//        System.out.println("No two sum solution");
//        return results;
//    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{(map.get(target  - nums[i])),i};
            } else {
                map.put(nums[i],i);
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int target = 6;
        new TwoSum().twoSum(nums,target);
    }
}
