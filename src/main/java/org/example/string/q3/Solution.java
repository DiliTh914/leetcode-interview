package org.example.string.q3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

    /**
     * Q3
     *
     * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
     *
     * Input: s = "leetcode"
     * Output: 0
     *
     * Input: s = "loveleetcode"
     * Output: 2
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();

        Set<Integer> set = new TreeSet<>();

        int i = 0;
        while (i < s.length()) {
            char c = charArray[i];
            Integer  intgr = map.get(c);
            if (intgr != null) {
                set.remove(intgr);
            } else {
                map.put(c, i);
                set.add(i);
            }
            i++;
        }

        if (set.isEmpty()) {
            return -1;
        } else {
            return (int) set.toArray()[0];
        }

    }


}
