// Problem: Running Sum of 1d Array
// Platform: LeetCode
// Problem Number: 1480
// Difficulty: Easy
// Topic: Prefix Sum
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] runningSum(int[] nums) {

        int[] ans = new int[nums.length];

        ans[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }

        return ans;
    }
}
