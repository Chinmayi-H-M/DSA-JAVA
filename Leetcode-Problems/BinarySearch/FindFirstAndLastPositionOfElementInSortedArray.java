// Problem: Find First and Last Position of Element in Sorted Array
// Platform: LeetCode
// Difficulty: Medium
// Date: 31-07-2026
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    // Find the first occurrence of target
    private int findFirst(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Find the last occurrence of target
    private int findLast(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}

/*
Approach:
1. Use Binary Search to find the first occurrence of the target.
2. Use Binary Search again to find the last occurrence of the target.
3. If the target is not present, both functions return -1.
4. Return the indices of the first and last occurrences.
*/
