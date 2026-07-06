// Problem: Subarray Sums Divisible by K
// Platform: LeetCode
// Difficulty: Medium
// Topic: Prefix Sum, HashMap

import java.util.HashMap;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(min(n, k))

    public int subarraysDivByK(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Remainder 0 has occurred once
        map.put(0, 1);

        int count = 0;
        int prefixSum = 0;

        for (int num : nums) {

            prefixSum += num;

            int rem = prefixSum % k;

            // Handle negative remainders
            if (rem < 0) {
                rem += k;
            }

            // If remainder seen before,
            // add its frequency to answer
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }

            // Update remainder frequency
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}

/*
Approach:
1. Compute running prefix sum.
2. Calculate prefixSum % k.
3. Convert negative remainder to positive.
4. If the same remainder has appeared before,
   the subarray between them is divisible by k.
5. Store frequency of each remainder.
*/
