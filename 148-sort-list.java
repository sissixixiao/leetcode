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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            pre = slow;
            slow = slow.next;
        }
        pre.next = null;
        ListNode n1 = sortList(head);
        ListNode n2 = sortList(slow);
        return merge(n1, n2);
    }
    
    private ListNode merge(ListNode head1, ListNode head2) {
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        ListNode n1 = head1;
        ListNode n2 = head2;
        while (n1 != null || n2 != null) {
            if (n1 == null) {
                pre.next = n2;
                pre = n2;
                n2 = n2.next;
            } else if (n2 == null || n1.val <= n2.val) {
                pre.next = n1;
                pre = n1;
                n1 = n1.next;
            } else {
                pre.next = n2;
                pre = n2;
                n2 = n2.next;
            }
        }
        return fakeHead.next;
    }
}