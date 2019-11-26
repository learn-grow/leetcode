package com.learn.leetcode.l20191126_2;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : lisy
 * @version $Id: IsPalindromeSolution, v 0.1 2019年11月26日 下午6:22 lisy Exp $
 */
public class IsPalindromeSolution {


    /**
     * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        Set<Character> characters = new HashSet<>();

        int n = s.length();
        int i = 0, j = n - 1;
        while (i < n && j >= 0){
            if (i == j){
                return true;
            }

            if (!characters.contains(s.charAt(i))){
                characters.add(s.charAt(i++));
            }
            if (characters.contains(s.charAt(j))){
                characters.remove(s.charAt(j--));
            }else {
                return false;
            }
        }


        return true;
    }
}
