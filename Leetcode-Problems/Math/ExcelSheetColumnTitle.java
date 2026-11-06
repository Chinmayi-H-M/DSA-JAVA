
/*
 * Problem: Excel Sheet Column Title
 * Platform: LeetCode
 * Problem Number: 168
 * Difficulty: Easy
 * Topic: Math, Strings
 *
 * Approach:
 * 1. Decrease columnNumber by 1 to handle 1-based numbering.
 * 2. Find the remainder using modulo 26.
 * 3. Convert the remainder into an uppercase character.
 * 4. Append the character to StringBuilder.
 * 5. Divide columnNumber by 26 and repeat.
 * 6. Reverse the result to get the correct column title.
 *
 * Time Complexity: O(log26(n))
 * Space Complexity: O(log26(n))
 */

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while(columnNumber >0){
            columnNumber = columnNumber-1;
            int rem=columnNumber%26;
            char character=(char)('A'+rem);
            result.append(character);
            columnNumber=columnNumber/26;
        }
        return result.reverse().toString();
    }
}
