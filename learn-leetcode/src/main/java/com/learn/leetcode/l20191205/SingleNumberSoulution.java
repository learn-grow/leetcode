package com.learn.leetcode.l20191205;

import java.util.HashMap;

/**
 * @author : lisy
 * @version $Id: SingleNumberSoulution, v 0.1 2019年12月05日 4:57 PM lisy Exp $
 */
public class SingleNumberSoulution {

    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 异或的方式处理
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums) {
        int i = nums[0];

        for (int j = 1; j < nums.length; j++) {
            i = i ^ nums[j];
        }

        return i;
    }
}
