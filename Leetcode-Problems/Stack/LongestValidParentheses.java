/*
 * Problem: Longest Valid Parentheses
 * Platform: LeetCode
 * Problem Number: 32
 * Difficulty: Hard
 * Topic: Stack, String
 *
 * Approach:
 * Use a stack to store indices of parentheses.
 * Initially push -1 as the base index.
 * Push the index of every opening parenthesis.
 * For a closing parenthesis, pop the stack.
 * If the stack becomes empty, push the current index
 * as the new boundary.
 * Otherwise, calculate the valid substring length
 * using the difference between the current index
 * and the index at the top of the stack.
 * Maintain the maximum valid length.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * n = Length of the input string
 */

class Solution {
    public int longestValidParentheses(String s) {

        Stack<Integer> stack = new Stack<>();

        stack.push(-1);

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {

                stack.push(i);

            } else {

                stack.pop();

                if (stack.isEmpty()) {

                    stack.push(i);

                } else {

                    max = Math.max(max, i - stack.peek());

                }
            }
        }

        return max;
    }
}
