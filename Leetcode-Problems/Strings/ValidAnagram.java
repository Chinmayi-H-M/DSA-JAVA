// Problem: Valid Anagram
// Platform: LeetCode
// Difficulty: Easy
// Topic: Strings, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of characters in s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract frequency using t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        // Check if all frequencies are zero
        for (char c : map.keySet()) {
            if (map.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}

/*
Approach:
1. If lengths differ, strings cannot be anagrams.
2. Count character frequencies using HashMap.
3. Increment counts for first string.
4. Decrement counts for second string.
5. If all counts become zero, strings are anagrams.
*/
