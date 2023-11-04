package org.example.string.q8;

public class Solution {

    /**
     * Q8
     *
     * Write a function to find the longest common prefix string amongst an array of strings.
     *
     * If there is no common prefix, return an empty string "".
     *
     * eg:
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     *
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     */
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        if (strs.length == 0) return prefix;

        prefix += strs[0];

        for (String str : strs) {
            while (str.indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }

        return prefix;

    }
}
