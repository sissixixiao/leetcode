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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode fakeHead = new ListNode(0);
        ListNode n = fakeHead;
        ListNode n1 = l1;
        ListNode n2 = l2;
        int carry = 0;
        while (n1 != null || n2 != null || carry != 0) {
            int v1 = 0;
            if (n1 != null) {
                v1 = n1.val;
                n1 = n1.next;
            }
            int v2 = 0;
            if (n2 != null) {
                v2 = n2.val;
                n2 = n2.next;
            }
            int sum = v1 + v2 + carry;
            n.next = new ListNode(sum % 10);
            n = n.next;
            carry = sum / 10;
        }
        return fakeHead.next;
    }
}