package org.example.linkedlists.q4;

public class Solution {

    /**
     * Q4:
     * You are given the heads of two sorted linked lists list1 and list2.
     *
     * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
     *
     * Return the head of the merged linked list.
     *
     * Input: list1 = [1,2,4], list2 = [1,3,4]
     * Output: [1,1,2,3,4,4]
     *
     *
     * Input: list1 = [], list2 = []
     * Output: []
     *
     * Input: list1 = [], list2 = [0]
     * Output: [0]
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode currentNode = head;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    currentNode.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    currentNode.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                currentNode.next = new ListNode(list1.val);
                list1 = list1.next;

            } else {
                currentNode.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            currentNode = currentNode.next;
        }

        return head.next;
    }

}
