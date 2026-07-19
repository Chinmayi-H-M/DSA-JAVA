// Problem: Minimum Window Substring
// Platform: LeetCode
// Difficulty: Hard
// Topic: Sliding Window, HashMap

class Solution {

    // Time Complexity: O(m + n)
    // Space Complexity: O(k)
    // (k = number of distinct characters in t)

    public String minWindow(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        String ans = "";

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {

                if (map.get(ch) > 0) {
                    count--;
                }

                map.put(ch, map.get(ch) - 1);
            }

            // Try to shrink the window
            while (count == 0) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    ans = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {

                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return ans;
    }
}

/*
Approach:
1. Store the frequency of all characters in t using a HashMap.
2. Expand the sliding window by moving the right pointer.
3. Decrease the frequency of matched characters and reduce the count.
4. When all characters are matched (count == 0), shrink the window from the left.
5. Keep updating the minimum valid window.
6. Return the smallest substring containing all characters of t.
*/
