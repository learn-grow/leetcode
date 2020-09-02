package com.demo.one;

import java.util.List;

/**
 * @author: lisy
 * @version: : SolutionIP , v0.1 2020年06月09日 9:50 下午
 * @remark: the SolutionIP is
 */
public class SolutionIP {

    public static void main(String[] args) {
        ipToCIDR("255.0.0.7", 10);
    }

    public static List<String> ipToCIDR(String ip, int n) {

        long longip = ipToLong(ip);

        return null;
    }

    private static long ipToLong(String ip) {
        long ans = 0;
        for (String s : ip.split("\\.")) {

            ans = ans * 256 + Integer.valueOf(s);
            System.out.println(ans);
        }

        return ans;
    }
}
