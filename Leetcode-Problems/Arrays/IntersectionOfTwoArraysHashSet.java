
/*
 * Problem: Intersection of Two Arrays
 * Platform: LeetCode
 * Problem Number: 349
 * Difficulty: Easy
 * Topic: Arrays, HashSet
 *
 * Approach:
 * Store elements of nums1 in a HashSet.
 * Traverse nums2 and add matching elements to an ArrayList.
 * Remove matched elements from the set to avoid duplicates.
 * Convert the ArrayList into an integer array.
 *
 * Time Complexity: O(n + m) average
 * Space Complexity: O(n + m)
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
        
    }
}
