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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        ListNode n = head;
        int len = 1;
        while (n != null && n.next != null) {
            n = n.next;
            len++;
        }
        n.next = head;
        k %= len;
        k = len - k;
        n = head;
        while (k > 1) {
            n = n.next;
            k--;
        }
        ListNode next = n.next;
        n.next = null;
        return next;
    }
}