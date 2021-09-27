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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode n = head.next;
        while (n != null) {
            if (n.val != pre.val) {
                pre.next = n;
                pre = n;
            }
            n = n.next;
        }
        pre.next = null;
        return head;
    }
}