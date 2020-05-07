package com.learn.leetcode.str;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author: lisy
 * @version: : MatchStr , v0.1 2020年05月06日 10:52 下午
 * @remark: the MatchStr is
 */
public class MatchStr {


    public static void main(String[] args) {
        boolean flag = isValid("()");
        System.out.println(flag);
    }

    private static Map<String ,String> map = new HashMap<String, String>(){
        {
            put(")","(");
            put("}","{");
            put("]","[");
        }
    };

    public static boolean isValid(String s) {
        if(s.length() == 0 || s == null){
            return true;
        }
        Stack<String> stack = new Stack<>();
        for (String ch : s.split("")) {
            if (map.containsValue(ch)){
                stack.push(ch);
            }else if (map.containsKey(ch)){
                if (stack.empty() || !stack.pop().equals(map.get(ch))){
                    return false;
                }
            }

        }
        return stack.empty();
    }

}
