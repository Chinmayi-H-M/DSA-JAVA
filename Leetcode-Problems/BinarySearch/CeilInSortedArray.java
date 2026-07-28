// Problem: Ceil in a Sorted Array
// Platform: GeeksforGeeks
// Difficulty: Easy
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    public int findCeil(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }
}

/*
Approach:
1. Use Binary Search on the sorted array.
2. If arr[mid] >= x, store mid as a possible answer and search the left half.
3. Otherwise, search the right half.
4. Continue until the search space is exhausted.
5. Return the index of the smallest element greater than or equal to x.
*/
