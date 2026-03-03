// Problem: Contains Duplicate II
// Platform: LeetCode
// Difficulty: Easy
// Topic: Arrays, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {

                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }
}

/*
Approach:
1. Use HashMap to store number and its latest index.
2. If number already exists, check index difference.
3. If difference <= k, return true.
4. Otherwise update index.
*/
