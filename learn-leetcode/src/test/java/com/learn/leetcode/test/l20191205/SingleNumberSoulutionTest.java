package com.learn.leetcode.test.l20191205;

import com.learn.leetcode.l20191205.SingleNumberSoulution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: SingleNumberSoulutionTest, v 0.1 2019年12月05日 5:04 PM lisy Exp $
 */
public class SingleNumberSoulutionTest {

    @Test
    public void soulution(){
        SingleNumberSoulution singleNumberSoulution = new SingleNumberSoulution();

       int a = singleNumberSoulution.singleNumber2(new int[]{4,1,2,1,2});

        System.out.println(a);
    }
}
