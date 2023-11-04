package org.example.array.q11;

class Solution {

    /**
     * Q11
     * <a href="https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/770/">...</a>
     * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
     *
     * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
     * DO NOT allocate another 2D matrix and do the rotation.
     *
     * eg:
     *
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [[7,4,1],[8,5,2],[9,6,3]]
     *
     * Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
     * Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
     */
    public void rotate(int[][] matrix) {

        int len = matrix.length;

        for (int i = 0; i < len/2; i++) {
            for (int j = i; j < len-1-i; j++) {
                int temp = matrix[j][len-1-i];
                matrix[j][len-1-i] = matrix[i][j];

                int temp2 = matrix[len-1-i][len-1-j];
                matrix[len-1-i][len-1-j] = temp;

                int temp3 = matrix[len-1-j][i];
                matrix[len-1-j][i] = temp2;

                matrix[i][j] = temp3;
            }
        }
    }
}
