// Problem: Reverse String
// Platform: LeetCode
// Difficulty: Easy
// Topic: Strings, Two Pointers

class Solution {

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

/*
Approach:
1. Initialize two pointers:
   - left at the beginning
   - right at the end
2. Swap characters at left and right.
3. Move left forward and right backward.
4. Continue until the pointers meet.
*/
