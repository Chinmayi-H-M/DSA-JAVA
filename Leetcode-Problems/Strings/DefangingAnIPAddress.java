// Problem: Defanging an IP Address
// Platform: LeetCode
// Problem Number: 1108
// Difficulty: Easy
// Topic: Strings
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
