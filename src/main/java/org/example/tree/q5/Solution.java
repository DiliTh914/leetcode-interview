package org.example.tree.q5;

import java.util.List;
import java.util.stream.IntStream;

public class Solution {

    /**
     * Q
     * https://leetcode.com/explore/interview/card/top-interview-questions-easy/94/trees/631/
     *
     * Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.
     *
     * Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
     *
     * Input: nums = [1,3]
     * Output: [3,1]
     * Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
     *
     * Constraints:
     *
     * 1 <= nums.length <= 104
     * -104 <= nums[i] <= 104
     * nums is sorted in a strictly increasing order.
     *
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        List<Integer> list = IntStream.of(nums).boxed().toList();

        int rootIdx = list.size()%2 == 0 ? list.size()/2-1 : list.size()/2;
        TreeNode root = new TreeNode(list.get(rootIdx));

        root.left = getVals(list.subList(0, rootIdx));
        root.right = getVals(list.subList(rootIdx+1, list.size()));

        return root;
    }

    private TreeNode getVals(List<Integer> list) {
        if(list.isEmpty()) return null;
        int rootIdx = list.size()%2 == 0 ? list.size()/2-1 : list.size()/2;
        TreeNode root = new TreeNode(list.get(rootIdx));

        root.left = getVals(list.subList(0, rootIdx));
        root.right = getVals(list.subList(rootIdx+1, list.size()));

        return root;
    }


}
