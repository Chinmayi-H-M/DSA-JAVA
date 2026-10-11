// Problem: Duplicate Zeros
// Platform: LeetCode
// Problem Number: 1089
// Difficulty: Easy
// Topic: Arrays
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {
    public void duplicateZeros(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }

                i++;
            }
        }
    }
}
