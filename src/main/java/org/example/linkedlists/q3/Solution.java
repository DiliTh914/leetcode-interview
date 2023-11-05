package org.example.linkedlists.q3;

public class Solution {

    /**
     * Q2:
     * Given the head of a singly linked list, reverse the list, and return the reversed list.
     *
     * Input: head = [1,2,3,4,5]
     * Output: [5,4,3,2,1]
     *
     * Input: head = [1,2]
     * Output: [2,1]
     *
     * Input: head = []
     * Output: []
     *
     * Constraints:
     *
     * The number of nodes in the list is the range [0, 5000].
     * -5000 <= Node.val <= 5000
     */
    public ListNode reverseList(ListNode head) {
        ListNode currentNode = null;
        while (head != null) {
            ListNode newNode = new ListNode(head.val, currentNode);
            currentNode = newNode;
            head = head.next;
        }

        return currentNode;
    }



}
