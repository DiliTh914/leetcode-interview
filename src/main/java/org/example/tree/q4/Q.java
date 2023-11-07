package org.example.tree.q4;

import java.util.List;

public class Q {
    public static void main(String[] args) {

        Solution solution = new Solution();

        String[] strs = {"ab", "a"};
        List<List<Integer>> x = solution.levelOrder(null);

        System.out.println(x);

    }
}