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
        if (head == null)
            return null;
        if (head.val == val)
            return removeElements(head.next, val);
        ListNode curr = head.next;
        ListNode prev = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
                curr = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}