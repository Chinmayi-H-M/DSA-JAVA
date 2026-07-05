// Problem: Continuous Subarray Sum
// Platform: LeetCode
// Difficulty: Medium
// Topic: Prefix Sum, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(min(n, k))

    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 seen before array starts
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];
            int rem = prefixSum % k;

            if (map.containsKey(rem)) {

                // Subarray length must be at least 2
                if (i - map.get(rem) >= 2) {
                    return true;
                }

            } else {

                // Store first occurrence of remainder
                map.put(rem, i);
            }
        }

        return false;
    }
}

/*
Approach:
1. Compute running prefix sum.
2. Store the first occurrence of each remainder (prefixSum % k).
3. If the same remainder appears again and the distance is at least 2,
   then the subarray sum is divisible by k.
4. Return true if such a subarray exists; otherwise return false.
*/
