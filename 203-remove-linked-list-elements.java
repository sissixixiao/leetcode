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
    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        ListNode node = head;
        while (node != null) {
            if (node.val != val) {
                pre.next = node;
                pre = node;
            }
            node = node.next;
        }
        pre.next = null;
        return fakeHead.next;
    }
}