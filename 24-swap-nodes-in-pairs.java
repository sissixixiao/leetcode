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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        ListNode node = head;
        while (node != null && node.next != null) {
            ListNode next = node.next;
            ListNode nnext = next.next;
            pre.next = next;
            next.next = node;
            pre = node;
            node = nnext;
        }
        if (node != null) pre.next = node;
        else pre.next = null;
        return fakeHead.next;
    }
}