package com.learn.leetcode.l20191126;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : lisy
 * @version $Id: Solution, v 0.1 2019年11月25日 下午3:35 lisy Exp $
 */
public class LengthOfLongestSubstringSolution {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> characters = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n){
            if (!characters.contains(s.charAt(j))){
                characters.add(s.charAt(j++));
                ans = Math.max(ans , j - i);
            }else{
                characters.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}
