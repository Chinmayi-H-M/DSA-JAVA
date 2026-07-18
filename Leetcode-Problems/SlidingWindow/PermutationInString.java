// Problem: Permutation in String
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window, HashMap

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(k)
    // (k = number of distinct characters in s1)

    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Store frequency of characters in s1
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = s1.length();

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);

            int value = map.getOrDefault(ch, 0);

            if (value > 0) {
                count--;
            }

            map.put(ch, value - 1);

            // Found a valid permutation
            if (count == 0) {
                return true;
            }

            // Maintain window size equal to s1.length()
            if (right - left + 1 == s1.length()) {

                char leftChar = s2.charAt(left);

                int leftValue = map.get(leftChar);

                if (leftValue >= 0) {
                    count++;
                }

                map.put(leftChar, leftValue + 1);
                left++;
            }
        }

        return false;
    }
}

/*
Approach:
1. Store the frequency of characters from s1 in a HashMap.
2. Use a sliding window of size equal to s1.length() on s2.
3. Decrease the frequency when expanding the window.
4. Increase the frequency when shrinking the window.
5. If all required characters are matched (count becomes 0),
   return true.
6. If no valid window is found, return false.
*/
