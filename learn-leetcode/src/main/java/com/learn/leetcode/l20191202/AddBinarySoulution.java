package com.learn.leetcode.l20191202;

/**
 * @author : lisy
 * @version $Id: HashTableSoulution, v 0.1 2019年12月02日 下午3:55 lisy Exp $
 * 二进制数加和
 */
public class AddBinarySoulution {


    public String addBinary(String a, String b) {

        int al = a.length();
        int bl = b.length();

        //补位
        while (al < bl) {
            a = "0" + a;
            ++al;
        }

        while (bl < al) {
            b = "0" + b;
            ++bl;
        }

        int ca = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = al - 1; i >= 0; i--) {
            int sumtemp = (a.charAt(i) - '0') + (b.charAt(i) - '0') + ca;
            builder.append(sumtemp % 2);
            ca = sumtemp / 2;
        }

        //处理最后一位是否进位
        if (ca > 0) {
            builder.append(ca);
        }

        return builder.reverse().toString();
    }

}
