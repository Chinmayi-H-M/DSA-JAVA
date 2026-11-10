/*
 * Problem: Excel Sheet Column Number
 * Platform: LeetCode
 * Problem Number: 171
 * Difficulty: Easy
 * Topic: Math, String
 *
 * Approach:
 * Convert the Excel column title from base 26 to decimal.
 * Calculate each character's value using charAt(i) - 'A' + 1.
 * Multiply the previous result by 26 and add the current value.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * n = Length of columnTitle
 */

class Solution {
    public int titleToNumber(String columnTitle) {
        int result=0;
        for(int i=0;i<columnTitle.length();i++){
            int value=columnTitle.charAt(i)-'A'+1;
            result=result*26+value;
        }
        return result;
    }
}
