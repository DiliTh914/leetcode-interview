package org.example.tree.q3;

import java.util.List;

public class Solution {

    /**
     * Q
     * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/627/">...</a>
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
     *
     * Input: root = [1,2,2,3,4,4,3]
     * Output: true
     *
     * Input: root = [1,2,2,null,3,null,3]
     * Output: false
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        else return getTree(root.left, root.right);

    }



    private boolean getTree(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2==null) {
            return true;
        } else if (treeNode1 == null || treeNode2==null) {
            return false;
        }

        if (treeNode1.val == treeNode2.val) {
            if (!getTree(treeNode1.left, treeNode2.right)) return false;
            return getTree(treeNode1.right, treeNode2.left);
        } else return false;
    }


}
