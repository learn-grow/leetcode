package com.learn.leetcode.l20191205;

/**
 * @author : lisy
 * @version $Id: GameSoulution, v 0.1 2019年12月05日 5:20 PM lisy Exp $
 */
public class GameSoulution {


    public int game(int[] guess, int[] answer) {

        int i = 0;
        for (int j = 0; j < guess.length; j++) {
            if ((guess[j] ^ answer[j]) == 0){
                ++i;
            }
        }
        return i;
    }
}
