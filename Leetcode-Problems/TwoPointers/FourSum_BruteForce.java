
import java.util.*;

class Solution {

    /*
     * Problem: 18. 4Sum
     * Difficulty: Medium
     *
     * Approach: Brute Force (4 Nested Loops)
     *
     * Idea:
     * Check every possible combination of four elements.
     * If their sum equals target, add the quadruplet
     * to a HashSet to avoid duplicates.
     *
     * Steps:
     * 1. Use four nested loops to select four elements.
     * 2. Calculate their sum using long to avoid overflow.
     * 3. If sum == target, create a quadruplet.
     * 4. Sort the quadruplet to maintain a consistent order.
     * 5. Add it to HashSet to avoid duplicates.
     * 6. Copy unique quadruplets into the result.
     *
     * Time Complexity: O(n^4)
     * - Four nested loops generate all possible quadruplets.
     * - Sorting each quadruplet takes O(1), since size is 4.
     *
     * Auxiliary Space Complexity: O(k)
     * - HashSet stores unique quadruplets.
     *
     * Output Space Complexity: O(4k)
     * - Stores k unique quadruplets, each containing 4 elements.
     *
     * Result: Time Limit Exceeded (TLE)
     *
     * Learning:
     * Brute force checks every possible combination.
     * Optimized using Sorting + Two Pointers to achieve O(n^3).
     */

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                for (int k = j + 1; k < n - 1; k++) {
                    for (int l = k + 1; l < n; l++) {

                        long sum = (long) nums[i] + nums[j]
                                 + nums[k] + nums[l];

                        if (sum == target) {

                            List<Integer> temp = Arrays.asList(
                                nums[i], nums[j], nums[k], nums[l]
                            );

                            List<Integer> sorted =
                                new ArrayList<>(temp);

                            Collections.sort(sorted);

                            set.add(sorted);
                        }
                    }
                }
            }
        }

        result.addAll(set);

        return result;
    }
}
