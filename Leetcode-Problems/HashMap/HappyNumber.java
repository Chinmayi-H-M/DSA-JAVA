
import java.util.*;

class Solution {

    /*
     * Problem: 202. Happy Number
     * Difficulty: Easy
     *
     * Approach: HashSet + Cycle Detection
     *
     * Idea:
     * Repeatedly replace the number with the sum of
     * squares of its digits.
     *
     * If the number becomes 1, it is a Happy Number.
     *
     * If a number repeats, a cycle exists,
     * so it is not a Happy Number.
     *
     * Steps:
     * 1. Create a HashSet to store visited numbers.
     * 2. Continue until n becomes 1.
     * 3. If n already exists in HashSet, return false.
     * 4. Add n to the HashSet.
     * 5. Calculate the sum of squares of its digits.
     * 6. Update n with the calculated sum.
     */

    public boolean isHappy(int n) {

        HashSet<Integer> h = new HashSet<>();

        while (n != 1) {

            // Check if a cycle exists
            if (h.contains(n)) {
                return false;
            }

            // Store the current number
            h.add(n);

            int sum = 0;

            // Calculate sum of squares of digits
            while (n > 0) {

                int digit = n % 10;

                sum += digit * digit;

                n /= 10;
            }

            // Update n
            n = sum;
        }

        return true;
    }

    /*
     * Complexity Analysis:
     *
     * Let:
     * d = Number of digits in the input number.
     * k = Number of transformations before reaching
     *     1 or detecting a repeated number.
     *
     * Time Complexity: O(k * d)
     *
     * - Each transformation processes all digits: O(d).
     * - HashSet insertion and lookup take O(1) average time.
     * - We perform k transformations.
     *
     * Auxiliary Space Complexity: O(k)
     *
     * - HashSet stores previously visited numbers.
     *
     * Overall Space Complexity: O(k)
     */
}
