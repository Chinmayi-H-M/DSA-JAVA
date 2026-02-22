// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy
// Date: 22-02-2026
// Topic: Arrays

/*
Problem:
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution.
*/
```java
  import java.util.Arrays;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            int j=i+1;
            while(j<nums.length){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    return new int[]{i,j};
                }
                j++;
            }
            i++;
        }
        return new int[] {-1,-1};
        
    }
}
```
