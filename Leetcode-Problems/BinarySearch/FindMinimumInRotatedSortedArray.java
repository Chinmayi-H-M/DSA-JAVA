// Problem: Find Minimum in Rotated Sorted Array
// Platform: LeetCode
// Difficulty: Medium
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Minimum lies in the left half (including mid)
            if (nums[mid] <= nums[right]) {
                right = mid;
            }
            // Minimum lies in the right half
            else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}

/*
Approach:
1. Use Binary Search on the rotated sorted array.
2. Compare the middle element with the rightmost element.
3. If nums[mid] <= nums[right], the minimum lies in the left half (including mid).
4. Otherwise, the minimum lies in the right half.
5. Continue until left == right, which points to the minimum element.
*/
