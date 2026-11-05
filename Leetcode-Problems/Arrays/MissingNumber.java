
/*
 * Problem: Missing Number
 * Platform: LeetCode
 * Problem Number: 268
 * Difficulty: Easy
 * Topic: Arrays, Math
 *
 * Approach:
 * 1. Calculate the expected sum of numbers from 0 to n
 *    using the formula n * (n + 1) / 2.
 * 2. Calculate the actual sum of elements in the array.
 * 3. Subtract the actual sum from the expected sum
 *    to find the missing number.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int num:nums){
            actualSum+=num;
        }
        return expectedSum-actualSum;
    }
}
