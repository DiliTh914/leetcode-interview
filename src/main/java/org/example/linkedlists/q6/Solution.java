package org.example.linkedlists.q6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    /**
     * Q6:
     * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/773/
     * Given head, the head of a linked list, determine if the linked list has a cycle in it.
     *
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
     *
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     *
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     *
     *
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
     *
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     */
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        boolean hasCycle = false;
        
        while (head.next != null) {
            if (head.val==Integer.MAX_VALUE) {
                hasCycle = true;
                break;
            }
            head.val = Integer.MAX_VALUE;
            head = head.next;
        }

        return hasCycle;

    }

}

