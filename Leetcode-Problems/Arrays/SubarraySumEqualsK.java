// Problem: Subarray Sum Equals K
// Platform: LeetCode
// Difficulty: Medium
// Topic: Prefix Sum, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Prefix sum 0 occurs once
        map.put(0, 1);

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {

            prefixSum += num;

            // Check if a previous prefix sum exists
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store current prefix sum frequency
            map.put(prefixSum,
                    map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

/*
Approach:
1. Maintain running prefix sum.
2. For each prefixSum, check if
   (prefixSum - k) exists.
3. If it exists, a subarray with sum k is found.
4. Store frequency of prefix sums in HashMap.
5. Return total count.
*/
