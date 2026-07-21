// Problem: Search in Rotated Sorted Array
// Platform: LeetCode
// Difficulty: Medium
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[mid] >= nums[left]) {

                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }
}

/*
Approach:
1. Use Binary Search to find the target.
2. At every step, determine which half of the array is sorted.
3. If the target lies within the sorted half, search there.
4. Otherwise, search in the other half.
5. Continue until the target is found or the search space becomes empty.
*/
