package com.eureka.server.demo;

/**
 * @author: lisy
 * @version: : IsNumberDemo , v0.1 2020年09月02日 11:04 上午
 * @remark: the IsNumberDemo is
 */
public class IsNumberDemo {

    private static boolean isNumber(String s){
        if (null == s || s.length() == 0){
            return false;
        }

        boolean isE = false;
        boolean isD = false;
        boolean isN = false;

        char[] chars = s.trim().toCharArray();

        for (int i = 0 ; i < chars.length ; ++i){
            char c = chars[i];
            if (c >= '0' && c <= '9'){
                isN = true;
            }else if (c == '+' || c == '-'){
                if (i != 0 && chars[i-1] != 'e' && chars[i-1] != 'E'){
                    return false;
                }
            }else if (c == '.'){
                if (isE || isD){
                    return false;
                }
                isD = true;
            }else if (c == 'E' || c == 'e'){
                if (isE || !isN){
                    return false;
                }
                isE = true;
                isD = false;
            }else{
                return false;
            }
        }
        return isN;
    }
}
