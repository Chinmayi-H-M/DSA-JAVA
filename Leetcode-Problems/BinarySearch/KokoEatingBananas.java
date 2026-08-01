// Problem: Koko Eating Bananas
// Platform: LeetCode
// Difficulty: Medium
// Topic: Binary Search

class Solution {

    // Time Complexity: O(n × log(maxPile))
    // Space Complexity: O(1)

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canEat(piles, h, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Check if Koko can finish all bananas at speed k
    private boolean canEat(int[] piles, int h, int k) {

        long hours = 0;

        for (int pile : piles) {
            hours += (pile + k - 1) / k;
        }

        return hours <= h;
    }
}

/*
Approach:
1. The eating speed lies between 1 and the maximum pile size.
2. Use Binary Search to find the minimum possible eating speed.
3. For each speed, calculate the total hours needed.
4. If Koko can finish within h hours, try a smaller speed.
5. Otherwise, increase the eating speed.
*/
