// Problem: Sort Array By Parity
// Platform: LeetCode
// Problem Number: 905
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;

        for (int k = 0; k < nums.length; k++) {
            if (nums[k] % 2 == 0) {
                ans[i] = nums[k];
                i++;
            } else {
                ans[j] = nums[k];
                j--;
            }
        }

        return ans;
    }
}
