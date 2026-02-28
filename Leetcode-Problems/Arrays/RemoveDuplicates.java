// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode
// Difficulty: Easy
// Topic: Arrays, Two Pointers

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int k = 1; // Pointer for unique elements

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}

/*
Approach:
1. Since array is sorted, duplicates will be adjacent.
2. Use one pointer (k) to track position of unique elements.
3. Traverse array and copy only unique elements forward.
4. Return count of unique elements (k).
*/
