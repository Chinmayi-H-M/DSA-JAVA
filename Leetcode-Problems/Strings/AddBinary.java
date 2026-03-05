// Problem: Add Binary
// Platform: LeetCode
// Difficulty: Easy
// Topic: Strings, Simulation

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}

/*
Approach:
1. Start from the end of both strings.
2. Add digits along with carry.
3. Append sum % 2 to result.
4. Update carry = sum / 2.
5. Reverse the result at the end.
*/
