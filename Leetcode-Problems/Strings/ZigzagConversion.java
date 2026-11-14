/*
 * Problem: Zigzag Conversion
 * Platform: LeetCode
 * Problem Number: 6
 * Difficulty: Medium
 * Topic: Strings, StringBuilder
 *
 * Approach:
 * Create a StringBuilder for each row.
 * Traverse the input string and append each character
 * to the corresponding row.
 * Use direction tracking to move down and up between rows.
 * Finally, combine all row StringBuilders.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n + numRows)
 * n = Length of the input string
 */

class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1||numRows>=s.length()){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        int direction=1;
        for(int i=0;i<s.length();i++){
            rows[row].append(s.charAt(i));
            if(row==numRows-1){
                direction=-1;
            }
            else if(row==0){
                direction=1;
            }
            row=row+direction;
        }
        StringBuilder result= new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(rows[i]);
        }
        return result.toString();
    }
}
