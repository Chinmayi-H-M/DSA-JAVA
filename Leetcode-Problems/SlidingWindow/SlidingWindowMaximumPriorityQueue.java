
/*
 * Problem: Sliding Window Maximum
 * Platform: LeetCode
 * Problem Number: 239
 * Difficulty: Hard
 * Topic: Sliding Window, Priority Queue, Heap
 *
 * Approach:
 * Use a max heap to store each element and its index.
 * Remove expired elements when they reach the top of the heap.
 * The top element gives the maximum for the current window.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 *
 * Alternative Approach: Deque — O(n) time and O(k) space
 */

class Solution {
    static class Pair implements Comparable<Pair>{
        int val;
        int idx;

        Pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(Pair p2){
            return p2.val-this.val;
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res=new int[nums.length-k+1];
        PriorityQueue<Pair> pq=new PriorityQueue<>();

        for(int i=0;i<k;i++){
            pq.add(new Pair(nums[i],i));
        }

        res[0]=pq.peek().val;

        for(int i=k;i<nums.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }

            pq.add(new Pair(nums[i],i));
            res[i-k+1]=pq.peek().val;
        }

        return res;
    }
}
