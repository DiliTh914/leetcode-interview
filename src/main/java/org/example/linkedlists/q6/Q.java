package org.example.linkedlists.q6;

public class Q {

    public static void main(String[] args) {

        Solution solution = new Solution();

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

//        ListNode head2 = new ListNode(7);
//        ListNode node21 = new ListNode(8);
//        ListNode node22 = new ListNode(9);
//        ListNode node23 = new ListNode(10);
//        ListNode node24 = new ListNode(11);
//
//        head2.next = node21;
//        node21.next = node22;
//        node22.next = node23;
//        node23.next = node24;

        boolean node = solution.hasCycle(head);

        System.out.println("");


    }
}
