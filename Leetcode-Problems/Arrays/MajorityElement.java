// Problem: Majority Element
// Platform: LeetCode
// Problem Number: 169
// Difficulty: Easy
// Topic: Arrays / Sorting
// Time Complexity: O(n log n)
// Space Complexity: O(1) auxiliary space

class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}
