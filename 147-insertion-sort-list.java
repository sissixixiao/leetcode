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
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode pre = head;
        ListNode node = head.next;
        while (node != null) {
            ListNode next = node.next;
            if (pre.val <= node.val) {
                pre.next = node;
                pre = node;
            } else {
                pre.next = null;
                ListNode pn = fakeHead;
                ListNode n = fakeHead.next;
                while (n != null) {
                    if (n.val > node.val) {
                        pn.next = node;
                        node.next = n;
                        break;
                    }
                    pn = n;
                    n = n.next;
                }
            }
            node = next;
        }
        return fakeHead.next;
    }
}