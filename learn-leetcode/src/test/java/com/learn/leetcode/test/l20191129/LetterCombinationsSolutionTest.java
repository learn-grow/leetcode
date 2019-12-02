package com.learn.leetcode.test.l20191129;

import com.learn.leetcode.l20191129.LetterCombinationsSolution;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author : lisy
 * @version $Id: LetterCombinationsSolutionTest, v 0.1 2019年12月02日 上午10:32 lisy Exp $
 */
public class LetterCombinationsSolutionTest {


    @Test
    public void letterCombinations(){

        LetterCombinationsSolution letterCombinationsSolution  = new LetterCombinationsSolution();

        List<String> list = letterCombinationsSolution.letterCombinations("23");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s + ",");
            }
        });

    }
}
