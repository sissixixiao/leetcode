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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;
        ListNode fast = fakeHead;
        ListNode slow = fakeHead;
        while (n >= 0 && fast != null) {
            fast = fast.next;
            n--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        if (slow != null && slow.next != null) slow.next = slow.next.next;
        return fakeHead.next;
    }
}