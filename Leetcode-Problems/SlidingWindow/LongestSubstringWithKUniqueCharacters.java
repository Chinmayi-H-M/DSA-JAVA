// Problem: Longest Substring with K Unique Characters
// Platform: GeeksforGeeks
// Difficulty: Medium
// Topic: Sliding Window, HashMap

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(k)

    public int longestKSubstr(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        int n = s.length();
        int maxLen = -1;
        int left = 0;

        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {

                char leftChar = s.charAt(left);

                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            if (map.size() == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}

/*
Approach:
1. Use a sliding window with two pointers.
2. Store character frequencies in a HashMap.
3. Expand the window by moving the right pointer.
4. If the number of distinct characters becomes greater than k,
   shrink the window from the left.
5. Whenever the window contains exactly k distinct characters,
   update the maximum length.
*/
