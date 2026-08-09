// Problem: Split Array Largest Sum
// Platform: LeetCode
// Difficulty: Hard
// Topic: Binary Search on Answer

class Solution {

    // Time Complexity: O(n * log(sum of nums))
    // Space Complexity: O(1)

    public int splitArray(int[] nums, int k) {

        int n = nums.length;

        if (k > n) {
            return -1;
        }

        long low = 0;
        long high = 0;

        // Minimum possible answer = maximum element
        // Maximum possible answer = total sum
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canAllocate(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    // Check if array can be split into at most k subarrays
    // such that each subarray sum <= maxSum
    private static boolean canAllocate(int[] arr, int k, long maxSum) {

        int subarrays = 1;
        long sum = 0;

        for (int num : arr) {

            if (sum + num <= maxSum) {
                sum += num;
            } else {
                subarrays++;
                sum = num;
            }
        }

        return subarrays <= k;
    }
}

/*
Approach:
1. The minimum possible largest sum is the maximum element.
2. The maximum possible largest sum is the total sum.
3. Binary Search between these two values.
4. For each possible maximum sum, greedily split the array.
5. Count how many subarrays are required.
6. If we need <= k subarrays, try a smaller maximum sum.
7. Otherwise, increase the maximum sum.
*/
