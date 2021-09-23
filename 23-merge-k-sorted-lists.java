/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) pq.offer(lists[i]);
        }
        while (!pq.isEmpty()) {
            ListNode n = pq.poll();
            pre.next = n;
            pre = n;
            if (n.next != null) pq.offer(n.next);
        }
        return fakeHead.next;
    }
}