// Problem: How Many Numbers Are Smaller Than the Current Number
// Platform: LeetCode
// Problem Number: 1365
// Difficulty: Easy
// Topic: Arrays / Brute Force
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] ans = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
