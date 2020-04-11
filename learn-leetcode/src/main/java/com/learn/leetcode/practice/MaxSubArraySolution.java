package com.learn.leetcode.practice;

import java.util.HashMap;

/**
 * @author : lisy
 * @version $Id: MaxSubArraySolution, v 0.1 2020年03月19日 6:16 PM lisy Exp $
 */
public class MaxSubArraySolution {

    public int trap(int[] height) {
        int maxh = getmax(height);
        int sumx = 0;
        for(int i = 1;i<maxh;i++){
            sumx += sumTemp(height,i-1);
        }
        return sumx;

    }

    private int sumTemp(int[] nums,int temp){
        int num = 0;
        for(int j = 0 ;j<nums.length;j++){
            if(temp == nums[j] && nums[j] != 0){
                num++;
            }
        }
        return num;
    }

    private int getmax(int[] nums){
        int maxh = 0;
        for(int i = 0;i< nums.length ;i++){
            if(maxh > nums[i]){
                maxh = nums[i];
            }
        }

        HashMap map = new HashMap();
        return maxh;

    }

    public static void main(String[] args) {
        int k = 2;
        k%=3;
        System.out.println(k);
        System.out.println();
    }
}
