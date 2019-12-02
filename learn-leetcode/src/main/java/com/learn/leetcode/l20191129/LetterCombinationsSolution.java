package com.learn.leetcode.l20191129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author : lisy
 * @version $Id: LetterCombinationsSolution, v 0.1 2019年11月29日 下午4:35 lisy Exp $
 */
public class LetterCombinationsSolution {

    Map<String, String> map = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> output = new ArrayList<String>();

    public void outStr(String comm, String nextStr) {
        if (nextStr.length() == 0) {
            output.add(comm);
        } else {
            String next = nextStr.substring(0, 1);
            String strings = map.get(next);
            for (int i = 0; i < strings.length(); i++) {
                String letter = strings.substring(i, i + 1);
                outStr(comm + letter, nextStr.substring(1));
            }
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() != 0)
            outStr("", digits);
        return output;
    }

    public List<String> letterCombinationsV2(String digits) {
       if (digits.length() == 0){
           return output;
       }

        for (int i = 0; i < digits.length(); i++) {

        }

       return output;
    }
}
