// Problem: Count Integers With Even Digit Sum
// Platform: LeetCode
// Difficulty: Easy
// Topic: Math

class Solution {

    // Time Complexity: O(n log n)
    // Space Complexity: O(1)

    public int countEven(int num) {
        int count = 0;

        for(int i = 1; i <= num; i++) {

            int sum = 0;
            int temp = i;

            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}

/*
Approach:
1. Loop from 1 to num.
2. Calculate digit sum for each number.
3. If digit sum is even, increment count.
4. Return total count.
*/
