// Problem: String Compression
// Platform: LeetCode
// Problem Number: 443
// Difficulty: Medium
// Topic: Strings / Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int compress(char[] chars) {

        int w = 0;

        for (int i = 0; i < chars.length; i++) {

            int count = 1;

            chars[w] = chars[i];

            while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            w++;

            if (count > 1) {
                String s = String.valueOf(count);

                for (char c : s.toCharArray()) {
                    chars[w] = c;
                    w++;
                }
            }
        }

        return w;
    }
}
