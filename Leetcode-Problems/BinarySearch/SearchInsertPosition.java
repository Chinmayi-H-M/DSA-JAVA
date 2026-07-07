// Problem: Search Insert Position
// Platform: LeetCode
// Difficulty: Easy
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return low;  // Insert position
    }
}

/*
Approach:
1. Use binary search to find target.
2. If found → return index.
3. If not found → low will be correct insert position.
*/
