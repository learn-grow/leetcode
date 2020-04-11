package com.learn.leetcode;

import java.util.HashMap;

/**
 * @author: lisy
 * @version: : TwoSum , v0.1 2020年04月11日 12:11 下午
 * @remark: the TwoSum is
 */
public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ;i < nums.length ; i++){
            int temp =  target - nums[i];
            if (map.containsKey(temp)) return new int[]{map.get(temp),i};
            map.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{1,2,3,4},3);
        if (ints != null){
            for (int anInt : ints) {
                System.out.println(anInt);
            }
        }
        System.out.println("end");
    }
}
