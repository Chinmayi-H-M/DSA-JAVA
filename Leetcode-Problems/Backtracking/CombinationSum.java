
import java.util.*;

class Solution {

    /*
     * Problem: 39. Combination Sum
     * Difficulty: Medium
     *
     * Approach: Backtracking
     *
     * Idea:
     * Find all unique combinations whose sum equals target.
     *
     * Each candidate can be used multiple times.
     *
     * start ensures we don't generate duplicate combinations
     * in different orders.
     *
     * Steps:
     * 1. If remaining == 0, we found a valid combination.
     * 2. If remaining < 0, stop exploring that path.
     * 3. Start the loop from the current index.
     * 4. Choose a candidate.
     * 5. Recursively explore with the SAME index (i),
     *    because elements can be reused.
     * 6. Remove the last element to backtrack.
     */

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(0, target, candidates, new ArrayList<>());

        return result;
    }

    public void backtrack(int start, int remaining,
                          int[] candidates, List<Integer> current) {

        // Base Case: Target reached
        if (remaining == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Pruning: Remaining target becomes negative
        if (remaining < 0) {
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore (same index allows reuse)
            backtrack(i, remaining - candidates[i],
                      candidates, current);

            // Backtrack (Undo)
            current.remove(current.size() - 1);
        }
    }

    /*
     * Complexity Analysis:
     *
     * Let:
     * n = Number of candidates
     * T = Target
     * M = Minimum candidate value
     *
     * Maximum recursion depth = T / M
     *
     * Time Complexity:
     * O(n^(T/M)) - Upper-bound estimate of the search tree.
     * Additional time is required to copy valid combinations.
     *
     * Auxiliary Space Complexity:
     * O(T/M)
     * - Recursion stack.
     * - Current combination list.
     *
     * Output Space Complexity:
     * O(K * T/M)
     * - K is the number of valid combinations.
     * - Each combination can contain at most T/M elements.
     *
     * Note: Space complexity excludes the input array.
     */
}
