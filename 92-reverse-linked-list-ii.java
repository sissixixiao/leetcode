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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode fakeHead = new ListNode(0);
        ListNode pre = fakeHead;
        pre.next = head;
        ListNode node = head;
        int index = 1;
        while (index < left) {
            pre = node;
            node = node.next;
            index++;
        }
        ListNode end1 = pre;
        ListNode start2 = node;
        pre = node;
        node = node.next;
        index++;
        
        while (index <= right) {
            ListNode next = node.next;
            node.next = pre;
            pre = node;
            node = next;
            index++;
        }
        ListNode end2 = pre;
        ListNode start3 = node;
        
        end1.next = end2;
        start2.next = start3;
        
        return fakeHead.next;
    }
}