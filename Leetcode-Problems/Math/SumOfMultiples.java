// Problem: Sum of Multiples
// Platform: LeetCode
// Difficulty: Easy
// Topic: Math

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int sumOfMultiples(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}

/*
Approach:
1. Iterate from 1 to n.
2. Check whether the current number is divisible by
   3, 5, or 7.
3. If it is divisible by at least one of them, add it to sum.
4. Return the total sum.
*/
