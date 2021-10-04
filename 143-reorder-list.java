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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        // find half
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode fast = fakeHead;
        ListNode slow = fakeHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        reorder(head, reverse(head2));
    }
    
    private void reorder(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) return;
        ListNode pre = head1;
        ListNode n1 = head1.next;
        ListNode n2 = head2;
        boolean fromOne = false;
        while (n1 != null || n2 != null) {
            if (fromOne) {
                pre.next = n1;
                pre = n1;
                n1 = n1.next;
            } else {
                pre.next = n2;
                pre = n2;
                n2 = n2.next;
            }
            fromOne = !fromOne;
        }
    }
    
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = null;
        ListNode node = head;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;
    }
}