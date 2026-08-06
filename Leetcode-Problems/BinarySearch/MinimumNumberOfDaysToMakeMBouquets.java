// Problem: Minimum Number of Days to Make m Bouquets
// Platform: LeetCode
// Difficulty: Medium
// Date: 06-08-2026
// Topic: Binary Search on Answer

class Solution {

    // Time Complexity: O(n × log(maxBloomDay))
    // Space Complexity: O(1)

    public int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        // Not enough flowers
        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find search range
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Check if m bouquets can be made by 'day'
    private boolean canMake(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {

                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}

/*
Approach:
1. If m × k is greater than the total number of flowers, return -1.
2. Binary Search on the answer (number of days).
3. For each day, count how many bouquets can be formed.
4. If at least m bouquets can be made, try a smaller day.
5. Otherwise, increase the number of days.
*/
