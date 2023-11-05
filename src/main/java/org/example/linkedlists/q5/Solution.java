package org.example.linkedlists.q5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Solution {

    /**
     * Q5:
     * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/772/">...</a>
     * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
     *
     * Input: head = [1,2,2,1]
     * Output: true
     *
     * Input: head = [1,2]
     * Output: false
     */
    public boolean isPalindrome(ListNode head) {

        List<Integer> list = loop(head,new ArrayList<>());

        return list.isEmpty() || list.size() == 1;

    }

    private List<Integer> loop(ListNode head, List<Integer> list) {
        if (head != null) {
            list.add(head.val);
            head = head.next;
            loop(head, list);
        }

        if (list.size() > 1 && Objects.equals(list.get(0), list.get(list.size() - 1))) {
            list.remove(0);
            list.remove(list.size()-1);
        }

        return list;
    }

}

