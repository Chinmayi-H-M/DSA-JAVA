// Problem: Allocate Books
// Platform: GeeksforGeeks
// Difficulty: Medium
// Topic: Binary Search on Answer

class Solution {

    // Time Complexity: O(n log(sum of pages))
    // Space Complexity: O(1)

    public int findPages(int[] arr, int k) {

        int n = arr.length;

        // More students than books
        if (k > n) {
            return -1;
        }

        long low = 0;
        long high = 0;

        // Minimum possible answer = maximum pages
        // Maximum possible answer = total pages
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        long ans = high;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canAllocate(arr, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }

    // Check whether books can be allocated to at most k students
    private static boolean canAllocate(int[] arr, int k, long maxPage) {

        int students = 1;
        long pageSum = 0;

        for (int pages : arr) {

            if (pageSum + pages <= maxPage) {
                pageSum += pages;
            } else {
                students++;
                pageSum = pages;
            }
        }

        return students <= k;
    }
}

/*
Approach:
1. Each student must get at least one book.
2. The minimum possible maximum pages is the largest single book.
3. The maximum possible maximum pages is the total number of pages.
4. Binary Search between these two values.
5. For each possible maximum page limit, greedily allocate books.
6. If allocation needs <= k students, try a smaller limit.
7. Otherwise, increase the limit.
*/
