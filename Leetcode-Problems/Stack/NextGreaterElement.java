// Problem: Next Greater Element
// Platform: GeeksforGeeks
// Difficulty: Medium
// Topic: Stack / Monotonic Stack

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public ArrayList<Integer> nextLargerElement(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        // Initialize answer with -1
        for (int i = 0; i < n; i++) {
            ans.add(-1);
        }

        Stack<Integer> stack = new Stack<>();

        // Traverse from right to left
        for (int i = n - 1; i >= 0; i--) {

            // Remove elements that cannot be the
            // next greater element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Top of stack is the next greater element
            if (!stack.isEmpty()) {
                ans.set(i, stack.peek());
            }

            // Add current element to stack
            stack.push(arr[i]);
        }

        return ans;
    }
}

/*
Approach:
1. Traverse the array from right to left.
2. Maintain a stack of possible greater elements.
3. Remove all elements from the stack that are
   smaller than or equal to the current element.
4. The remaining top element is the next greater element.
5. Push the current element into the stack.
*/
