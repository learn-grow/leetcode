package com.solution._739;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author: lisy
 * @version: : DailyTemperatures , v0.1 2020年06月11日 3:42 下午
 * @remark: the DailyTemperatures is
 */
public class DailyTemperatures {

    /**
     * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
     *
     * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
     *
     * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
     *
     * 来源：https://leetcode-cn.com/problems/daily-temperatures
     * @param T
     * @return
     */

    /**
     * 暴力破解
     *
     * @param T
     * @return
     */
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        int before = 0;
        for (int i = 0; i < length; ++i) {
            int cueent = T[i];
            if (cueent < 100) {
                for (int j = i + 1; j < length; ++j) {
                    if (T[j] > cueent) {
                        result[i] = j - i;
                        break;
                    }
                }
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public int[] getInt(int[] ints) {
        int[] result = new int[]{};
        int[] temp = new int[30001];
        int j = 0;
        for (int i = 0; i < ints.length; ++i) {
            int v = ints[i];
            if (temp[v] == 0) {
                temp[v] = v;
            } else {
                result[j] = v;
                ++j;
            }
        }
        return result;
    }

    public static int findDuplicate(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i == 0) {
                temp = temp ^ nums[i];
            } else {
                int j = temp;
                temp = temp ^ nums[i];
                if ((temp ^ nums[i - 1]) == j) { //|| (temp ^ nums[i-1]) == 0
                    return nums[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 1}));
        System.out.println(1 ^ 3);
        System.out.println(1 ^ 3 ^ 4);
        System.out.println(1 ^ 3 ^ 4 ^ 2);
        System.out.println(1 ^ 3 ^ 4 ^ 2 ^ 1);
        System.out.println(1 ^ 3 ^ 4 ^ 2 ^ 1 ^ 1);
    }

    public int climbStairs(int n) {
        if (n <= 2) return n;
        int f1 = 1, f2 = 2;
        for (int i = 2; i < n; ++i) {
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }

    public void merge(int[] A, int m, int[] B, int n) {
        int length = m + n;

        for (int i = length - 1; i >= 0; --i) {
            if (m > 0 && n > 0) {
                if (A[m - 1] < B[n - 1]) {
                    A[i] = B[--n];
                } else {
                    A[i] = A[--m];
                }
            } else if (n > 0 && m == 0) {
                A[i] = B[--n];
            }
        }
    }

    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0) {
            return new int[0];
        }

        Queue<Integer> queue = new PriorityQueue<>(k, (i1, i2) -> Integer.compare(i2, i1));

        for (int e : arr) {
            if (queue.isEmpty() || queue.size() < k || e < queue.peek()) {
                queue.offer(e);
            }
            if (queue.size() > k) {
                queue.poll();
            }
        }

        int[] res = new int[queue.size()];
        int j = 0;
        for (int e : queue) {
            res[j++] = e;
        }

        return res;

    }
}

