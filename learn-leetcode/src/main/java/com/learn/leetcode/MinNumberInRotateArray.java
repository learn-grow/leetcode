package com.learn.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author: lisy
 * @version: : MinNumberInRotateArray , v0.1 2020年04月11日 11:33 上午
 * @remark: the MinNumberInRotateArray is
 */
public class MinNumberInRotateArray {

    /**
     * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入 一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2} 为{1,2,3,4,5}的一个旋转，该数组的最小值为 1。 NOTE:给出的所有元素都大于 0，若数组大小为 0，请返回 0。
     * 解题思路
     * 1. 旋转之后的数组存在两个上升序列，最小元素在两个上升序列的中间
     * 2. 用两个指针在两个序列中找到最大和最小的值，这样 end 指向的数则为最小
     * @param array
     * @return
     * {1,2,3,4,5}
     */
    public static int minNumberInRotateArray(int[] array){
        if (array.length == 0) return 0;
        int start = 0 ,end = array.length - 1;
        while (end - start != 1){
            int mid = (start + end ) / 2;
            if (array[mid] >= array[start]){
                start = mid;
            }
            if (array[mid] <= array[end]){
                end = mid;
            }
        }
        return array[end];
    }

    public static void main(String[] args) {
        int val = minNumberInRotateArray(new int[]{1,2,3,4,5});
        System.out.println(val);
    }
}
