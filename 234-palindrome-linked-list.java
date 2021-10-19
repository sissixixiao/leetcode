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
    public boolean isPalindrome(ListNode head) {
        // fisrt half, second half
        // reverse second half
        // compare
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode slowNext = slow.next;
        slow.next = null;
        ListNode head2 = reverse(slowNext);
        return compare(head, head2);
    }
    
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode pre = head;
        ListNode node = head.next;
        while (node != null) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        head.next = null;
        return pre;
    }
    
    private boolean compare(ListNode head, ListNode head2) {
        ListNode n1 = head;
        ListNode n2 = head2;
        while (n1 != null && n2 != null) {
            if (n1.val != n2.val) return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }
}