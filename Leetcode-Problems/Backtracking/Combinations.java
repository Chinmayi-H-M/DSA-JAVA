
import java.util.*;

class Solution {

    /*
     * Problem: 77. Combinations
     * Difficulty: Medium
     *
     * Approach: Backtracking
     *
     * Idea:
     * Generate all possible combinations of k numbers
     * chosen from the range [1, n].
     *
     * Steps:
     * 1. If current.size() == k, we found a valid combination.
     * 2. Start the loop from the current start index.
     * 3. Choose a number and add it to current.
     * 4. Recursively explore using i + 1.
     * 5. Remove the last element to backtrack.
     *
     * Using i + 1 ensures that:
     * - The same number is not selected again.
     * - Duplicate combinations are avoided.
     */

    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {

        backtrack(1, n, k, new ArrayList<>());

        return result;
    }

    public void backtrack(int start, int n, int k,
                          List<Integer> current) {

        // Base Case: Combination of size k is formed
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {

            // Choose
            current.add(i);

            // Explore
            backtrack(i + 1, n, k, current);

            // Backtrack (Undo)
            current.remove(current.size() - 1);
        }
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity:
     * O(sum(C(n,j)) + k * C(n,k)), for j = 0 to k.
     *
     * - Explores possible partial combinations.
     * - Copies each valid combination into result.
     *
     * Auxiliary Space Complexity: O(k)
     *
     * - Recursion stack: O(k)
     * - Current list: O(k)
     *
     * Output Space Complexity:
     * O(k * C(n,k))
     *
     * - There are C(n,k) valid combinations.
     * - Each combination contains k elements.
     *
     * Overall Space Complexity:
     * O(k * C(n,k)) including output.
     */
}
