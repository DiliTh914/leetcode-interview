package org.example.tree.q2;

public class Solution {

    /**
     * Q
     * Given the root of a binary tree, return its maximum depth.
     *
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     *
     * Input: root = [3,9,20,null,null,15,7]
     * Output: 3
     *
     * Input: root = [1,null,2]
     * Output: 2
     */
    public int maxDepth(TreeNode root) {
        if (root != null) {
            traverse(root, 1);
        }
        return maxDepth;

    }

    int maxDepth = 0;

    void traverse(TreeNode node, int currentDept) {
        if(node.left!=null) {
            traverse(node.left, currentDept + 1);
        }

        if (node.right!=null) {
            traverse(node.right, currentDept + 1);
        }

        if(node.right==null && node.left==null) {
            if (currentDept>maxDepth) {
                maxDepth = currentDept;
            }
        }
    }
}
