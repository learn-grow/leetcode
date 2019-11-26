package com.learn.leetcode.test.l20191126;

import com.learn.leetcode.l20191126.LengthOfLongestSubstringSolution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: SolutionTest, v 0.1 2019年11月25日 下午3:36 lisy Exp $
 */
public class LengthOfLongestSubstringSolutionTest {

    @Test
    public void lengthOfLongestSubstringTest(){
        LengthOfLongestSubstringSolution lengthOfLongestSubstringSolution = new LengthOfLongestSubstringSolution();

        int ans = lengthOfLongestSubstringSolution.lengthOfLongestSubstring("abcabdd");
        System.out.println("the string length is :" + ans);

    }
}
