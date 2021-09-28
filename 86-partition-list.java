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
    public ListNode partition(ListNode head, int x) {
        ListNode fakeHead1 = new ListNode(0);
        ListNode fakeHead2 = new ListNode(0);
        ListNode pre1 = fakeHead1;
        ListNode pre2 = fakeHead2;
        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                pre1.next = node;
                pre1 = node;
            } else {
                pre2.next = node;
                pre2 = node;
            }
            node = node.next;
        }
        pre1.next = fakeHead2.next;
        pre2.next = null;
        return fakeHead1.next;
    }
}