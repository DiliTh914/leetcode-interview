package org.example.string.q2;

public class Solution {

    /**
     * Q2
     * Given a signed 32-bit integer x, return x with its digits reversed.
     * If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
     *
     * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
     *
     * Input: x = 123
     * Output: 321
     *
     *
     * Input: x = -123
     * Output: -321
     *
     */
    public int reverse(int x) {
        boolean isNegative = x < 0;

        String str = String.valueOf((isNegative) ? -x : x);

        char[] s = str.toCharArray();

        int i = 0;
        while (i < s.length/2) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
            i++;
        }

        try {
            int newInt = Integer.parseInt(String.valueOf(s));
            return isNegative ? -newInt : newInt;
        } catch (Exception e) {
            return 0;
        }

    }

}
