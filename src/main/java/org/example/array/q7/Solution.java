package org.example.array.q7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    /**
     * Q7
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one and return the resulting array of digits.
     *
     * eg:
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     *
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     *
     */
    public int[] plusOne(int[] digits) {
        if (digits[digits.length-1] == 9) {

            int i = digits.length-1;
            while(true) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    i--;
                } else {
                    digits[i]++;
                    break;
                }

                if (i<0) {
                    int[] arr = new int[digits.length+1];
                    arr[0] = 1;
                    return arr;
                }
            }


        } else {
            digits[digits.length-1]++;
        }
        return digits;

    }
}
