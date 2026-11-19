
import java.util.*;

class Solution {

    /*
     * Problem: 46. Permutations
     * Difficulty: Medium
     *
     * Approach: Backtracking
     *
     * Idea:
     * Generate all possible permutations by selecting
     * one unused element at a time.
     *
     * used[] keeps track of elements already selected.
     *
     * Steps:
     * 1. Choose an unused element.
     * 2. Mark it as used.
     * 3. Recursively explore the next position.
     * 4. Undo the choice (backtrack).
     */

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        boolean[] used = new boolean[nums.length];

        backtrack(nums, used, current, res);

        return res;
    }

    public void backtrack(int[] nums, boolean[] used,
                          List<Integer> current,
                          List<List<Integer>> res) {

        // Base Case: A complete permutation is formed
        if (current.size() == nums.length) {
            res.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            // Skip already selected elements
            if (used[i]) {
                continue;
            }

            // Choose
            current.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, used, current, res);

            // Backtrack: Undo the choice
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(n * n!)
     * - There are n! possible permutations.
     * - Each permutation takes O(n) time to copy into res.
     *
     * Auxiliary Space Complexity: O(n)
     * - Recursion stack: O(n)
     * - current list: O(n)
     * - used array: O(n)
     *
     * Output Space Complexity: O(n * n!)
     * - Stores n! permutations.
     * - Each permutation contains n elements.
     *
     * Overall Space Complexity: O(n * n!)
     * Including the output.
     */
}
