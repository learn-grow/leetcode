package com.learn.leetcode.test.l20191203;

import com.learn.leetcode.l20191203.PlusOneSoulution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: PlusOneSoulutionTest, v 0.1 2019年12月03日 下午2:18 lisy Exp $
 */
public class PlusOneSoulutionTest {

    @Test
    public void soulution(){
        PlusOneSoulution plusOneSoulution = new PlusOneSoulution();

        int[] ints = plusOneSoulution.plusOne(new int[]{9});
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }
}
