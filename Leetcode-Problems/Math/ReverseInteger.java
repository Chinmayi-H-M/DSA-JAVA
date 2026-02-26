// Problem: Reverse Integer
// Platform: LeetCode
// Difficulty: Medium
// Topic: Math

class Solution {

    // Time Complexity: O(log10 n)
    // Space Complexity: O(1)

    public int reverse(int x) {

        int ans = 0;

        while (x != 0) {

            int rem = x % 10;
            x /= 10;
            if (ans > Integer.MAX_VALUE / 10 || 
               (ans == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }

            if (ans < Integer.MIN_VALUE / 10 || 
               (ans == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            ans = ans * 10 + rem;
        }

        return ans;
    }
}

/*
Approach:
1. Extract last digit using % 10.
2. Reduce number using / 10.
3. Before multiplying ans by 10, check for overflow.
4. If overflow occurs, return 0.
5. Otherwise build reversed number safely.
*/
