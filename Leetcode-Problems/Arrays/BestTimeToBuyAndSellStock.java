// Problem: Best Time to Buy and Sell Stock
// Platform: LeetCode
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
        }

        return maxProfit;
    }
}
