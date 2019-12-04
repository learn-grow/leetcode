package com.learn.leetcode.l20191204;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * -123
 * -321
 * 123
 * 321
 *
 * @author : lisy
 * @version $Id: ReverseSoulution, v 0.1 2019年12月04日 4:51 PM lisy Exp $
 */
public class ReverseSoulution {


    public int reverse(int x) {

        long temp = 0l;
        int te;
        while (x != 0) {
            te = x % 10;
            x = x / 10;
            temp = temp * 10 + te;
        }

        if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) temp;
    }


}
