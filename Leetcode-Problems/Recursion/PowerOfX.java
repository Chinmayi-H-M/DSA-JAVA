// Problem: Pow(x, n)
// Platform: LeetCode
// Problem Number: 50
// Difficulty: Medium
// Topic: Recursion / Divide and Conquer
// Time Complexity: O(log n)
// Space Complexity: O(log n)

class Solution {

    public double myPow(double x, int n) {

        long N = n;

        // Handle negative power
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return power(x, N);
    }

    public static double power(double x, long n) {

        // Base case
        if (n == 0) {
            return 1;
        }

        // Calculate x^(n/2)
        double halfPower = power(x, n / 2);

        // Square it
        halfPower = halfPower * halfPower;

        // If n is odd, multiply by x once more
        if (n % 2 != 0) {
            halfPower = x * halfPower;
        }

        return halfPower;
    }
}
