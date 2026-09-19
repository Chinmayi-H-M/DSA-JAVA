// Problem: Pascal's Triangle
// Platform: LeetCode
// Problem Number: 118
// Difficulty: Easy
// Topic: Arrays / Dynamic Programming
// Time Complexity: O(numRows²)
// Space Complexity: O(numRows²)

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();
            row.add(1);

            // Calculate middle elements
            for (int j = 1; j < i; j++) {
                int value = result.get(i - 1).get(j - 1)
                           + result.get(i - 1).get(j);

                row.add(value);
            }

            // Last element of every row is 1
            if (i > 0) {
                row.add(1);
            }

            result.add(row);
        }

        return result;
    }
}
