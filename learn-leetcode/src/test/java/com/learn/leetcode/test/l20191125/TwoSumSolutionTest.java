package com.learn.leetcode.test.l20191125;

import com.learn.leetcode.l20191125.TwoSumSolution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: SolutionTest, v 0.1 2019年11月25日 下午3:31 lisy Exp $
 */
public class TwoSumSolutionTest {

    @Test
    public void solution() {

        int[] nums = new int[]{1, 3, 6, 7};

        int target = 11;

        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] ints = twoSumSolution.twoSum(nums, target);
        if (ints != null) {
            for (int anInt : ints) {
                System.out.println("index:" + anInt + " value:" + nums[anInt]);
            }
        } else {
            System.out.println("the expected value was not find ！");
        }
    }

    public static void main(String args[]){
        System.out.println("42-42".matches("^([5-9]|\\d{2})-\\d*$"));
    }

}
