// Problem: Find All Anagrams in a String
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window, HashMap

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1) (HashMaps store at most the distinct characters)

    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) {
            return res;
        }

        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        // Store frequency of characters in pattern
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = p.length();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            if (pMap.containsKey(ch) &&
                sMap.get(ch) <= pMap.get(ch)) {
                count--;
            }

            // Shrink window if its size exceeds pattern length
            if (right - left + 1 > p.length()) {

                char leftChar = s.charAt(left);

                if (pMap.containsKey(leftChar) &&
                    sMap.get(leftChar) <= pMap.get(leftChar)) {
                    count++;
                }

                sMap.put(leftChar, sMap.get(leftChar) - 1);
                left++;
            }

            // Found an anagram
            if (count == 0) {
                res.add(left);
            }
        }

        return res;
    }
}

/*
Approach:
1. Store frequency of characters in the pattern.
2. Use a sliding window of size equal to the pattern length.
3. Track character frequencies in the current window.
4. Maintain a count of characters still needed to form an anagram.
5. When count becomes zero, record the starting index.
*/
