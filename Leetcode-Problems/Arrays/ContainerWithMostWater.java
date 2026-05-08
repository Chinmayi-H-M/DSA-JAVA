// Problem: Container With Most Water
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Two Pointers

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int maxArea(int[] height) {

        int n = height.length;
        int maxArea = 0;

        int l = 0;
        int r = n - 1;

        while (l < r) {

            int h = Math.min(height[l], height[r]);
            int w = r - l;

            int area = h * w;

            maxArea = Math.max(maxArea, area);

            // Move smaller height pointer
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }
}

/*
Approach:
1. Use two pointers: left at start, right at end.
2. Calculate area = min(height[left], height[right]) * width.
3. Update maximum area.
4. Move the pointer with smaller height inward.
5. Continue until pointers meet.
*/
