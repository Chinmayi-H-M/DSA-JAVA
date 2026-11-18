/*
 * Problem: First Missing Positive
 * Platform: LeetCode
 * Problem Number: 41
 * Difficulty: Hard
 * Topic: Array, HashSet
 *
 * Approach:
 * Store all positive numbers in a HashSet.
 * Iterate from 1 to nums.length + 1.
 * Return the first positive integer that is not present.
 *
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 * n = Length of the input array
 */

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            if(num>0){
                set.add(num);
            }
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
