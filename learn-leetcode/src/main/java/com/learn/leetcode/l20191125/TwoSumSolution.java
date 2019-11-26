package com.learn.leetcode.l20191125;

/**
 * @author : lisy
 * @version $Id: Solution, v 0.1 2019年11月25日 下午3:24 lisy Exp $
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }


}
