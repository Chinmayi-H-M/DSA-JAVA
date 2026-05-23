// Problem: Number of Provinces
// Platform: LeetCode
// Difficulty: Medium
// Topic: Graphs, Union Find (DSU)

class Solution {

    int[] parent;

    // Time Complexity: O(n^2 * α(n))
    // Space Complexity: O(n)

    public int findCircleNum(int[][] isConnected) {

        int n = isConnected.length;

        parent = new int[n];

        // Initialize parent array
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        int provinces = n;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                // If cities are connected
                if (isConnected[i][j] == 1) {

                    // If union happens, provinces decrease
                    if (union(i, j)) {
                        provinces--;
                    }
                }
            }
        }

        return provinces;
    }

    // Find parent with path compression
    private int find(int x) {

        if (parent[x] == x) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    // Union two sets
    private boolean union(int x, int y) {

        int px = find(x);
        int py = find(y);

        // Already connected
        if (px == py) {
            return false;
        }

        parent[py] = px;

        return true;
    }
}

/*
Approach:
1. Treat each city as its own province initially.
2. Use Union Find (DSU) to connect cities.
3. If two cities are connected, merge their sets.
4. Every successful union reduces province count.
5. Final province count is the answer.
*/
