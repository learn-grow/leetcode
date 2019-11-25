package com.learn.leetcode.test.l20191125;

import com.learn.leetcode.l20191125.Solution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: SolutionTest, v 0.1 2019年11月25日 下午3:31 lisy Exp $
 */
public class SolutionTest
{

    @Test
    public void solution()
    {

        int[] nums = new int[]{1, 3, 6, 7};

        int target = 11;

        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        if (ints != null){
            for (int anInt : ints)
            {
                System.out.println("下标:" + anInt + " 值:" + nums[anInt]);
            }
        }else{
            System.out.println("没有符合预期的值！");
        }


    }
}
