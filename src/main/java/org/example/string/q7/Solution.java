package org.example.string.q7;

public class Solution {

    /**
     * Q7
     *
     * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     *
     * eg:
     *
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     * Explanation: "sad" occurs at index 0 and 6.
     * The first occurrence is at index 0, so we return 0.
     *
     * Input: haystack = "leetcode", needle = "leeto"
     * Output: -1
     * Explanation: "leeto" did not occur in "leetcode", so we return -1.
     */
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
