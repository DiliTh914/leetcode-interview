package org.example.string.q4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    /**
     * Q4
     *
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     *
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
     * typically using all the original letters exactly once.
     *
     * eg:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] arr = new int[26];
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Set<Character> set = new HashSet<>();

        int i=0;
        while (i<c1.length) {
            arr[c1[i]-'a']++;

            if (arr[c1[i]-'a'] == 0) {
                set.remove(c1[i]);
            } else {
                set.add(c1[i]);
            }

            arr[c2[i]-'a']--;
            if (arr[c2[i]-'a'] == 0) {
                set.remove(c2[i]);
            } else {
                set.add(c2[i]);
            }

            i++;
        }

        return set.isEmpty();

    }
}
