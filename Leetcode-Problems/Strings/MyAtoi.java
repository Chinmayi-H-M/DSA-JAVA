
import java.util.*;

class Solution {

    /*
     * Problem: 8. String to Integer (atoi)
     * Difficulty: Medium
     *
     * Approach: String Traversal + Overflow Handling
     *
     * Logic:
     * 1. Skip leading whitespaces.
     * 2. Check the sign (+ or -).
     * 3. Convert consecutive digits into an integer.
     * 4. Stop when a non-digit character is encountered.
     * 5. Handle integer overflow using Integer.MAX_VALUE
     *    and Integer.MIN_VALUE.
     */

    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // Step 1: Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        // Step 3: Convert digits into integer
        int result = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {

            int digit = s.charAt(i) - '0';

            // Step 4: Check integer overflow
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1 ?
                       Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        // Step 5: Apply sign
        return result * sign;
    }

    /*
     * Complexity Analysis:
     *
     * Time Complexity: O(n)
     * - We traverse the string at most once.
     * - Each character is processed in O(1) time.
     *
     * Auxiliary Space Complexity: O(1)
     * - Only a fixed number of variables are used.
     * - No additional data structures are created.
     *
     * Overall Space Complexity: O(1)
     */
}
