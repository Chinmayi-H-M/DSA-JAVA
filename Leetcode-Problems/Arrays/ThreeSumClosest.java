// Problem: 3Sum Closest
// Platform: LeetCode
// Problem Number: 16
// Difficulty: Medium
// Topic: Arrays / Two Pointers
// Time Complexity: O(n²)
// Space Complexity: O(1) auxiliary space

class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);

        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n - 2; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum == target) {
                    return sum;
                }

                if (sum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }

        return closest;
    }
}
