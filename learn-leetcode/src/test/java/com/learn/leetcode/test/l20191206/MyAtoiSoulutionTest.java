package com.learn.leetcode.test.l20191206;

import com.learn.leetcode.l20191206.MyAtoiSoulution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: MyAtoiSoulutionTest, v 0.1 2019年12月06日 2:10 PM lisy Exp $
 */
public class MyAtoiSoulutionTest {


    @Test
    public void soulution(){
        MyAtoiSoulution myAtoiSoulution = new MyAtoiSoulution();

        int a = myAtoiSoulution.myAtoi("+-12");



        System.out.println(a);
    }
}
