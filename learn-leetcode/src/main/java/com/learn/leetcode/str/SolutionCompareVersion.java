package com.learn.leetcode.str;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: lisy
 * @version: : SolutionCompareVersion , v0.1 2020年05月07日 11:32 下午
 * @remark: the SolutionCompareVersion is
 */
public class SolutionCompareVersion {

    /**
     * 循环 ，不足位的补0，遇到相同的不处理
     * @param version1
     * @param version2
     * @return
     */
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int i = 0,j = 0;
        while (i < nums1.length || j < nums2.length){
            String i1 = i < nums1.length ? nums1[i] : "0";
            String i2 = j < nums2.length ? nums2[i] : "0";

            if (Integer.parseInt(i1) > Integer.parseInt(i2)){
                return 1;
            }else if (Integer.parseInt(i1) < Integer.parseInt(i2)){
                return -1;
            }
            i++;
            j++;
        }
        return 0;
    }
}
