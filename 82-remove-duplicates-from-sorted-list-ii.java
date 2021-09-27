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
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        ListNode n = head;
        while (n != null) {
            int v = n.val;
            if (n.next == null || n.next.val != n.val) {
                pre.next = n;
                pre = n;
                n = n.next;
            } else {
                while (n != null && n.val == v) {
                    n = n.next;
                }
            }
        }
        pre.next = null;
        return fakeHead.next;
    }
}