package org.example.string.q5;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * Q5
     *
     * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
     * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
     *
     * Given a string s, return true if it is a palindrome, or false otherwise.
     *
     * eg:
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     *
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     */
    public boolean isPalindrome(String s) {
        char[] c = s.toLowerCase().toCharArray();
        List<Character> stripedChars = new ArrayList<>();

        for (char ch : c) {
            if (ch-'a' >=0 && ch-'a'<26 || ch-'0' >=0 && ch-'0'<10) {
                stripedChars.add(ch);
            }
        }

        for (int i = 0; i < stripedChars.size()/2; i++) {
            if (stripedChars.get(i) != stripedChars.get(stripedChars.size()-1-i)) return false;
        }

        return true;
    }
}
