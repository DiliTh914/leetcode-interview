package org.example.tree.q2;

public class Solution {

    /**
     * Q
     * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/625/">...</a>
     * Given the root of a binary tree, determine if it is a valid binary search tree (BST).
     *
     * A valid BST is defined as follows:
     *
     * The left subtree of a node contains only nodes with keys less than the node's key.
     * The right subtree of a node contains only nodes with keys greater than the node's key.
     * Both the left and right subtrees must also be binary search trees.
     *
     * Input: root = [2,1,3]
     * Output: true
     *
     * Input: root = [5,1,4,null,null,3,6]
     * Output: false
     * Explanation: The root node's value is 5 but its right child's value is 4.
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    boolean isValidBST(TreeNode node, long max, long min) {
        if (node == null) return true;
        if (node.val >= max || node.val <= min) return false;
        return isValidBST(node.left, node.val, min) && isValidBST(node.right, max, node.val);
    }

}
