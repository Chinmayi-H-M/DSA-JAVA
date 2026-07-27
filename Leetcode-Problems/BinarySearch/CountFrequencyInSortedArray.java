// Problem: Count Frequency in a Sorted Array
// Platform: GeeksforGeeks
// Difficulty: Easy
// Topic: Binary Search

class Solution {

    // Time Complexity: O(log n)
    // Space Complexity: O(1)

    int countFreq(int[] arr, int target) {

        int first = findFirst(arr, target);

        if (first == -1) {
            return 0;
        }

        int last = findLast(arr, target);

        return last - first + 1;
    }

    // Find the first occurrence of target
    int findFirst(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    // Find the last occurrence of target
    int findLast(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
}

/*
Approach:
1. Use Binary Search to find the first occurrence of the target.
2. Use Binary Search again to find the last occurrence of the target.
3. If the target is not found, return 0.
4. Otherwise, the frequency is:
   last occurrence - first occurrence + 1.
*/
