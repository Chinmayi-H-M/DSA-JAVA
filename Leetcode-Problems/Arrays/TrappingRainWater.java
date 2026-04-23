// Problem: Trapping Rain Water
// Platform: LeetCode
// Difficulty: Hard
// Topic: Arrays, Two Pointers

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int trap(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int leftMax = height[left];
        int rightMax = height[right];

        int water = 0;

        while (left < right) {

            if (leftMax < rightMax) {

                left++;
                leftMax = Math.max(leftMax, height[left]);

                water += leftMax - height[left];
            }
            else {

                right--;
                rightMax = Math.max(rightMax, height[right]);

                water += rightMax - height[right];
            }
        }

        return water;
    }
}

/*
Approach:
1. Use two pointers: left and right.
2. Track maximum wall seen so far from left and right.
3. Water trapped at a position depends on smaller boundary.
4. Move pointer with smaller max boundary inward.
5. Add trapped water at each step.
*/
