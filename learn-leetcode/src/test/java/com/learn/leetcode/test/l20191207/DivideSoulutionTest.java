package com.learn.leetcode.test.l20191207;

import com.learn.leetcode.l20191207.DivideSoulution;
import org.junit.Test;

/**
 * @author : lisy
 * @version $Id: DivideSoulutionTest, v 0.1 2019年12月07日 11:18 AM lisy Exp $
 */
public class DivideSoulutionTest {

    @Test
    public void soulution(){
        DivideSoulution divideSoulution = new DivideSoulution();

        int ans = divideSoulution.divide2(10,3);

        System.out.println(ans);
    }
}
