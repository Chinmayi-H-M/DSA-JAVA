// Problem: Aggressive Cows
// Platform: GeeksforGeeks
// Difficulty: Medium
// Date: 05-08-2026
// Topic: Binary Search on Answer

import java.util.Arrays;

class Solution {

    // Time Complexity: O(n log n + n log(maxDistance))
    // Space Complexity: O(1)

    public int aggressiveCows(int[] arr, int k) {

        Arrays.sort(arr);

        int n = arr.length;

        int low = 1;
        int high = arr[n - 1] - arr[0];

        int ans = 0;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canPlace(arr, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Check if k cows can be placed with at least 'distance' apart
    private boolean canPlace(int[] arr, int k, int distance) {

        int count = 1;
        int lastPosition = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - lastPosition >= distance) {
                count++;
                lastPosition = arr[i];
            }
        }

        return count >= k;
    }
}

/*
Approach:
1. Sort the stall positions.
2. Binary Search on the minimum distance between cows.
3. For each distance, greedily place cows from left to right.
4. If all k cows can be placed, try a larger distance.
5. Otherwise, reduce the distance.
6. The maximum feasible minimum distance is the answer.
*/
