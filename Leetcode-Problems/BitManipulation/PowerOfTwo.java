// Problem: Power of Two
// Platform: LeetCode
// Difficulty: Easy
// Topic: Bit Manipulation

class Solution {

    // Time Complexity: O(1)
    // Space Complexity: O(1)

    public boolean isPowerOfTwo(int n) {

        return n > 0 && (n & (n - 1)) == 0;
    }
}

/*
Approach:

1. A power of two has only one bit set in binary.

Examples:
1  -> 0001
2  -> 0010
4  -> 0100
8  -> 1000

2. When we do n & (n - 1), the lowest set bit becomes 0.

Example:
n = 8

8  = 1000
7  = 0111
---------
&  = 0000

3. If result becomes 0, it means there was only one set bit.
So the number is a power of two.
*/
