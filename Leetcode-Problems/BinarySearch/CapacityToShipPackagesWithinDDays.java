// Problem: Capacity To Ship Packages Within D Days
// Platform: LeetCode
// Difficulty: Medium
// Date: 03-08-2026
// Topic: Binary Search

class Solution {

    // Time Complexity: O(n × log(sum(weights)))
    // Space Complexity: O(1)

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Minimum capacity = maximum weight
        // Maximum capacity = sum of all weights
        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        int ans = 0;

        while (low <= high) {

            int cap = low + (high - low) / 2;

            if (canShip(weights, days, cap)) {
                ans = cap;
                high = cap - 1;
            } else {
                low = cap + 1;
            }
        }

        return ans;
    }

    // Check if all packages can be shipped within given days
    private boolean canShip(int[] weights, int days, int cap) {

        int requiredDays = 1;
        int currentWeight = 0;

        for (int w : weights) {

            if (currentWeight + w > cap) {
                requiredDays++;
                currentWeight = w;
            } else {
                currentWeight += w;
            }
        }

        return requiredDays <= days;
    }
}

/*
Approach:
1. The minimum ship capacity is the maximum package weight.
2. The maximum ship capacity is the sum of all package weights.
3. Use Binary Search on the answer (capacity).
4. For each capacity, calculate how many days are required.
5. If packages can be shipped within the given days,
   try a smaller capacity; otherwise increase the capacity.
*/
