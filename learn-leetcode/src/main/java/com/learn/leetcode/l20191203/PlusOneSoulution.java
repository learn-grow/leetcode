package com.learn.leetcode.l20191203;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。
 输入: [1,2,3]
 输出: [1,2,4]
 解释: 输入数组表示数字 123。
 * @author : lisy
 * @version $Id: PlusOneSoulution, v 0.1 2019年12月03日 下午1:56 lisy Exp $
 */
public class PlusOneSoulution {


    public int[] plusOne(int[] digits) {

        int l = digits.length;
        int nextTemp = 0;
        int[] newArray = new int[l];

        for (int i = l - 1; i >= 0; i--) {
            int temp = 0;
            if (i == l - 1){
                temp = digits[i] + 1;
            }else {
                temp = digits[i];
            }
            newArray[i] = (temp + nextTemp) % 10;
            nextTemp = (temp + nextTemp) / 10;
        }

        if (nextTemp > 0) {
            int[] ints = new int[l + 1];
            ints[0] = nextTemp;
            for (int i = 0; i < newArray.length; i++) {
                ints[i + 1] = newArray[i];
            }
            return ints;
        }

        return newArray;
    }

}
