
/*
 * Problem: Merge k Sorted Lists
 * Platform: LeetCode
 * Problem Number: 23
 * Difficulty: Hard
 * Topic: Linked List, Priority Queue, Min Heap
 *
 * Approach:
 * 1. Insert the first node of every non-empty list into a min heap.
 * 2. Extract the smallest node and attach it to the merged list.
 * 3. Insert the extracted node's next node into the heap.
 * 4. Repeat until the priority queue becomes empty.
 *
 * Time Complexity: O(N log k)
 * Space Complexity: O(k)
 * N = Total number of nodes, k = Number of linked lists
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq= new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode node:lists){
            if(node!=null){
                pq.offer(node);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(!pq.isEmpty()){
            ListNode node=pq.poll();
            curr.next=node;
            curr=curr.next;
            if(node.next!=null){
                pq.offer(node.next);
            }
        }
        return dummy.next;
    }
}
