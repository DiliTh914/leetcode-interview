package org.example.tree.q4;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * Q
     * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/628/">...</a>
     * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
     *
     * Input: root = [3,9,20,null,null,15,7]
     * Output: [[3],[9,20],[15,7]]
     *
     * Input: root = [1]
     * Output: [[1]]
     *
     * Input: root = []
     * Output: []
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> elements = new ArrayList<>();
        if (root == null) return elements;

        traverseTree(root, elements, 0);

        return elements;

    }

    List<List<Integer>> traverseTree(TreeNode node, List<List<Integer>> elements, int depth) {
        if (elements.size()-1<depth) {
            List<Integer> list1 = new ArrayList<>();
            list1.add(node.val);
            elements.add(list1);
        } else {
            elements.get(depth).add(node.val);
        }

        if (node.left != null) {
            traverseTree(node.left, elements, depth+1);
        }
        if (node.right != null) {
            traverseTree(node.right, elements, depth+1);
        }

        return elements;
    }


}
