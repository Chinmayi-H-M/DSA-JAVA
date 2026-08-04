// Problem: Minimum Speed to Arrive on Time
// Platform: LeetCode
// Difficulty: Medium
// Date: 04-08-2026
// Topic: Binary Search

class Solution {

    // Time Complexity: O(n × log(10^7))
    // Space Complexity: O(1)

    public int minSpeedOnTime(int[] dist, double hour) {

        int low = 1;
        int high = (int) 1e7;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canReach(dist, hour, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    // Check if the destination can be reached within the given hour
    private boolean canReach(int[] dist, double hour, int speed) {

        double time = 0.0;

        for (int i = 0; i < dist.length; i++) {

            double t = (double) dist[i] / speed;

            // Round up time for every train except the last one
            if (i != dist.length - 1) {
                time += Math.ceil(t);
            } else {
                time += t;
            }
        }

        return time <= hour;
    }
}

/*
Approach:
1. The minimum possible speed is 1.
2. The maximum possible speed is 10^7.
3. Use Binary Search on the speed.
4. For each speed, calculate the total travel time.
5. Round up the time for every train except the last one.
6. If the total time is within the given hour, try a smaller speed.
7. Otherwise, increase the speed.
*/
