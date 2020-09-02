package com.demo.one;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: lisy
 * @version: : MaxString , v0.1 2020年06月09日 9:26 下午
 * @remark: the MaxString is
 */
public class MaxString {

    public static void main(String[] args) {
        int i = removeDuplicates(new int[]{1,1,1});
        System.out.println(i);
    }


    public static void maxStr(String s) {
        Set<Character> occ = new HashSet<>();
        int left = -1, ans = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }

            while (left + 1 < s.length() && !occ.contains(s.charAt(left + 1))) {
                occ.add(s.charAt(left + 1));
                ++left;
            }
            ans = Math.max(ans, left - i + 1);
        }
    }

    public int strStr(String haystack, String needle) {
        int h = haystack.length(), n = needle.length();

        for (int i = 0; i < h - n + 1; ++i) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 1;i<nums.length ;++i){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }



}

