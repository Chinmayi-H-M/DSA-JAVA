// Problem: Online Stock Span
// Platform: LeetCode
// Difficulty: Medium
// Topic: Stack / Monotonic Stack

import java.util.*;

class StockSpanner {

    // Time Complexity: O(n) amortized
    // Space Complexity: O(n)

    Stack<int[]> st;

    public StockSpanner() {
        st = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!st.isEmpty() && st.peek()[0] <= price) {
            span += st.pop()[1];
        }

        st.push(new int[]{price, span});

        return span;
    }
}

/*
Approach:
1. Store each stock price along with its span.
2. For the current price, remove all previous prices
   that are smaller than or equal to it.
3. Add their spans to the current span.
4. Push the current price and calculated span onto the stack.
5. Return the span.
*/
