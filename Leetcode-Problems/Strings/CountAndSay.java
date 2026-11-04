
/*
 * Problem: Count and Say
 * Platform: LeetCode
 * Problem Number: 38
 * Difficulty: Medium
 * Topic: Strings, StringBuilder
 *
 * Approach:
 * 1. Start with the initial sequence "1".
 * 2. Generate the next sequence by counting consecutive
 *    identical characters.
 * 3. Append the count followed by the character.
 * 4. Repeat until the nth sequence is generated.
 *
 * Time Complexity: O(n * L), where L is the maximum
 *                   intermediate sequence length
 * Space Complexity: O(L)
 */

class Solution {
    public String countAndSay(int n) {
        String result="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int count =1;
            for(int j=1;j<result.length();j++){
                if(result.charAt(j)==result.charAt(j-1)){
                    count++;
                }
                else{
                    sb.append(count);
                    sb.append(result.charAt(j-1));
                    count=1;
                }
            }
            sb.append(count);
            sb.append(result.charAt(result.length()-1));
            result=sb.toString();
        }
        return result;
    }
}
