// Problem: Asteroid Collision
// Platform: LeetCode
// Difficulty: Medium
// Topic: Stack

import java.util.*;

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {

            // Collision occurs only when:
            // stack top moves right (+)
            // current asteroid moves left (-)
            while (!st.isEmpty()
                    && asteroid < 0
                    && st.peek() > 0
                    && st.peek() < -asteroid) {

                st.pop();
            }

            // Check if a collision is still possible
            if (!st.isEmpty()
                    && asteroid < 0
                    && st.peek() > 0) {

                // Both asteroids destroy each other
                if (st.peek() == -asteroid) {
                    st.pop();
                }

                // Otherwise, the stack asteroid survives
            } else {
                st.push(asteroid);
            }
        }

        // Convert stack to array
        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}
