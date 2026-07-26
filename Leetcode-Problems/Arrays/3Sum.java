// Problem: 3Sum
// Platform: LeetCode
// Difficulty: Medium
// Topic: Arrays, Two Pointers

import java.util.*;

class Solution {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1) excluding output

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {

                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                }
                else if (sum > 0) {
                    r--;
                }
                else {
                    l++;
                }
            }
        }

        return res;
    }
}

/*
Approach:
1. Sort array.
2. Fix one element nums[i].
3. Use two pointers to find remaining two numbers.
4. Skip duplicates to avoid repeated triplets.
*/
