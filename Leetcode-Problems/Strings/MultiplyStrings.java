
/*
 * Problem: Multiply Strings
 * Platform: LeetCode
 * Problem Number: 43
 * Difficulty: Medium
 * Topic: Strings, Math, Array
 *
 * Approach:
 * 1. Handle multiplication by zero.
 * 2. Create a result array of size num1.length() + num2.length().
 * 3. Multiply digits from right to left using nested loops.
 * 4. Store the current digit and carry in the result array.
 * 5. Build the final string while skipping leading zeros.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(n + m)
 */

class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        int result[]=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                int d1=num1.charAt(i)-'0';
                int d2=num2.charAt(j)-'0';

                int sum=d1*d2+result[i+j+1];
                result[i+j+1]=sum%10;
                result[i+j]+=sum/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int digit : result){
            if(digit==0 && sb.length()==0){
                continue;
            }
            sb.append(digit);
        }
        return sb.toString();
    }
}
