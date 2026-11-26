
import java.util.*;

class Solution {

    /*
     * Problem: 18. 4Sum
     * Difficulty: Medium
     *
     * Approach: Sorting + Two Pointers
     *
     * Idea:
     * Find all unique quadruplets whose sum equals target.
     *
     * Steps:
     * 1. Sort the array.
     * 2. Fix the first element using i.
     * 3. Fix the second element using j.
     * 4. Use left and right pointers to find
     *    the remaining two elements.
     * 5. Skip duplicate elements to avoid duplicate quadruplets.
     * 6. Use long to prevent integer overflow.
     */

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < n - 2; j++) {

                // Skip duplicate second elements
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int left = j + 1;
                int right = n - 1;

                while (left < right) {

                    long sum = (long) nums[i] + nums[j]
                             + nums[left] + nums[right];

                    if (sum == target) {

                        result.add(Arrays.asList(
                            nums[i], nums[j],
                            nums[left], nums[right]
                        ));

                        left++;
                        right--;

                        // Skip duplicate left elements
                        while (left < right &&
                               nums[left] == nums[left - 1]) {
                            left++;
                        }

                        // Skip duplicate right elements
                        while (left < right &&
                               nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                    else if (sum < target) {
                        left++;
                    }
                    else {
                        right--;
                    }
                }
            }
        }

        return result;
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(n^3)
     * - Sorting: O(n log n)
     * - Two outer loops: O(n^2)
     * - Two pointer traversal: O(n)
     * - Overall: O(n^3)
     *
     * Auxiliary Space Complexity: O(log n)
     * - Sorting stack space (implementation-dependent).
     *
     * Output Space Complexity: O(k)
     * - k = Number of unique quadruplets.
     *
     * Overall Space Complexity: O(log n + k).
     */
}
