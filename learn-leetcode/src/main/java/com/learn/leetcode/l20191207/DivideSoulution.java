package com.learn.leetcode.l20191207;

/**
 * @author : lisy
 * @version $Id: DivideSoulution, v 0.1 2019年12月07日 11:14 AM lisy Exp $
 */
public class DivideSoulution {

    public int divide1(int dividend, int divisor) {
        long temp1 = dividend;
        long temp2 = divisor;

        int flag = 0;

        int i = 0;
        if (temp1 < 0) {
            flag++;
            temp1 = -temp1;
            temp1 = temp1 > Integer.MAX_VALUE ? Integer.MAX_VALUE : temp1;
        }
        if (temp2 < 0) {
            flag++;
            temp2 = -temp2;
            temp2 = temp2 > Integer.MAX_VALUE ? Integer.MAX_VALUE : temp2;
        }

        while (temp1 - temp2 >= 0) {
            temp1 = temp1 - temp2;
            i++;
        }

        if (flag > 0 && flag < 2) return -i;
        return i;
    }


    public int divide2(int dividend, int divisor) {
        boolean flag = (dividend > 0) ^ (divisor > 0);
        int result = 0;
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        while (dividend <= divisor) {
            int temp_result = -1;
            int temp_divisor = divisor;
            //除数<< (左移) 2的一次方,如果包含至少除数有两个被除数
            while (dividend <= (temp_divisor << 1)) {
                if (temp_divisor <= (Integer.MIN_VALUE >> 1)) break;
                temp_result = temp_result << 1;
                temp_divisor = temp_divisor << 1;
            }
            dividend = dividend - temp_divisor;
            result += temp_result;
        }
        if (!flag) {
            if (result <= Integer.MIN_VALUE) return Integer.MAX_VALUE;
            result = -result;
        }
        return result;
    }
}
