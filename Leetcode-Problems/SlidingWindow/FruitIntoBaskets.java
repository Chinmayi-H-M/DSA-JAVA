// Problem: Fruit Into Baskets
// Platform: LeetCode
// Difficulty: Medium
// Topic: Sliding Window, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int ans = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add current fruit to window
            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            // Shrink window if more than 2 fruit types
            while (map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Update maximum basket size
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}

/*
Approach:
1. Use sliding window with two pointers.
2. HashMap stores fruit type frequency.
3. Expand window using right pointer.
4. If window contains more than 2 fruit types,
   shrink from left.
5. Track maximum valid window length.
*/
