package com.learn.leetcode.l20191206;


/**
 * @author : lisy
 * @version $Id: MyAtoiSoulution, v 0.1 2019年12月06日 1:51 PM lisy Exp $
 */
public class MyAtoiSoulution {


    public int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        char[] chars = str.toCharArray();
        long ans = 0;
        int i = 0, sign = 1, n = str.length();
        while (i < n && chars[i] == ' ') {
            i++;
        }
        if (i < n && chars[i] == '+') {
            i++;
        } else if (i < n && chars[i] == '-') {
            i++;
            sign = -1;
        }

        while (i < n && (chars[i] >= '0' && chars[i] <= '9')) {
            if (ans != (int) ans) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans * 10 + chars[i++] - '0';
        }

        if (ans != (int) ans) {
            return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return (int) (ans * sign);
    }
}
