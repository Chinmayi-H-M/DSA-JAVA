
/*
 * Problem: Divide Two Integers
 * Platform: LeetCode
 * Problem Number: 29
 * Difficulty: Medium
 * Topic: Math, Bit Manipulation
 *
 * Approach:
 * 1. Handle the integer overflow case.
 * 2. Determine the sign of the result using XOR.
 * 3. Convert both numbers to positive long values.
 * 4. Repeatedly double the divisor using left shift.
 * 5. Subtract the largest possible multiple and accumulate the result.
 *
 * Time Complexity: O(log^2 |dividend|)
 * Space Complexity: O(1)
 */

class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor ==-1){
            return Integer.MAX_VALUE;
        }
        int sign=(dividend<0)^(divisor<0) ?-1:1;
        long result=0;
        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        while(a>=b){
            long temp=b;
            long multiple=1;
            while(a>=(temp<<1)){
                temp<<=1;
                multiple<<=1;
            }
            a-=temp;
            result+=multiple;
        }
        return (int)(sign == -1 ? -result : result);
    }
}
