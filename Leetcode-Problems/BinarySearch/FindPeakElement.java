// Problem: Find Peak Element
// Platform: LeetCode
// Difficulty: Medium
// Date: 22-02-2026
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            // Peak is in the left half (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            }
            // Peak is in the right half
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}

/*
Approach:
1. Use Binary Search to find a peak element.
2. Compare nums[mid] with nums[mid + 1].
3. If nums[mid] > nums[mid + 1], a peak lies in the left half (including mid).
4. Otherwise, a peak lies in the right half.
5. Continue until left == right. That index is a peak element.
*/
