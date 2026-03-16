// Problem: Valid Parentheses
// Platform: LeetCode
// Difficulty: Easy
// Topic: Stack

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int top = -1;

        for (char c : s.toCharArray()) {

            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack[++top] = c;
            } 
            else {

                if (top == -1) return false;

                char t = stack[top--];

                if ((c == ')' && t != '(') ||
                    (c == '}' && t != '{') ||
                    (c == ']' && t != '[')) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}

/*
Approach:

1. Use a stack to store opening brackets.
2. Push opening brackets onto stack.
3. When a closing bracket appears:
   - Pop the top element.
   - Check if it matches the correct opening bracket.
4. If mismatch occurs → return false.
5. If stack is empty at end → valid parentheses.
*/
