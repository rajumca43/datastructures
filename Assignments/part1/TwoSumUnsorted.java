package com.ds.bt.Assignments.part1;

public class TwoSumUnsorted {

    static void main(String[] args) {
        int[] nums = {3,2, 11, 15,7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0;i< nums.length;i++){
            int start = nums[i];
            for(int j=i+1;j<nums.length;j++){

                int total = start + nums[j];
                if(total == target)
                    return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
