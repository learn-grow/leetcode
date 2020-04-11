package com.learn.leetcode.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : lisy
 * @version $Id: ThreeSumSolution, v 0.1 2020年03月19日 6:03 PM lisy Exp $
 */
public class ThreeSumSolution {


    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int k = 0; k < nums.length - 2; k++) {

            if (nums[k] > 0) break;

            if (k > 0 && nums[k] == nums[k - 1]) continue;

            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[k] + nums[i] + nums[j];
                if (sum < 0) { //大于 0 代表负数太大，需要移动左指针
                    while (i < j && nums[i] == nums[++i]) ;
                } else if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }

        }

        return res;
    }
}
