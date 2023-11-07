package org.example.dynamic.q1;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Q
     * You are climbing a staircase. It takes n steps to reach the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * Input: n = 2
     * Output: 2
     * Explanation: There are two ways to climb to the top.
     * 1. 1 step + 1 step
     * 2. 2 steps
     *
     * Input: n = 3
     * Output: 3
     * Explanation: There are three ways to climb to the top.
     * 1. 1 step + 1 step + 1 step
     * 2. 1 step + 2 steps
     * 3. 2 steps + 1 step
     */
    public int climbStairs(int n) {
        return step(1, n) + step(2, n);
    }

    Map<Integer, Integer> map = new HashMap<>();

    private int step(int tempTot, int n) {
        if (tempTot == n) {
            return 1;
        } else if (tempTot > n) {
            return 0;
        } else if (map.containsKey(tempTot)) {
            System.out.println();
            return map.get(tempTot);
        }

        int tempVal = step(tempTot+1, n) + step(tempTot+2, n);
        map.put(tempTot, tempVal);
        return tempVal;

    }




}
