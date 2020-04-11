package com.learn.leetcode.practice;

import java.util.HashMap;

/**
 * @author : lisy
 * @version $Id: TwoSumSolution, v 0.1 2020年03月19日 4:00 PM lisy Exp $
 */
public class TwoSumSolution {


    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

     示例:

     给定 nums = [2, 7, 11, 15], target = 9

     因为 nums[0] + nums[1] = 2 + 7 = 9
     所以返回 [0, 1]
     * @param nums
     * @param target
     * @return
     */


    /**
     * 两边循环 时间复杂度 O(N^2)
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    return new int[]{nums[i],nums[j]};
                }
            }
        }
        return null;
    }

    /**
     * 两遍循环 hash表
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum2(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ;i < nums.length ;i++){
            map.put(nums[i] , i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i){
                return new int[]{i,map.get(temp)};
            }
        }

        return null;
    }

}
