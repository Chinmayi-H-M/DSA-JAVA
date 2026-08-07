// Problem: Magnetic Force Between Two Balls
// Platform: LeetCode
// Difficulty: Medium
// Date: 07-08-2026
// Topic: Binary Search on Answer

import java.util.Arrays;

class Solution {

    // Time Complexity: O(n log n + n × log(maxDistance))
    // Space Complexity: O(1)

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int n = position.length;
        int low = 1;
        int high = position[n - 1] - position[0];
        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(position, m, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Check if m balls can be placed with at least 'distance' apart
    private boolean canPlace(int[] position, int m, int distance) {

        int count = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - lastPosition >= distance) {
                count++;
                lastPosition = position[i];
            }
        }

        return count >= m;
    }
}

/*
Approach:
1. Sort the basket positions.
2. Binary Search on the minimum magnetic force (distance).
3. Greedily place balls from left to right.
4. If all m balls can be placed, try a larger distance.
5. Otherwise, reduce the distance.
6. The maximum feasible minimum distance is the answer.
*/
