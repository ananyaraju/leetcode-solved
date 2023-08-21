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
    int max;
    public ListNode traverse(ListNode head) {
        if (head == null)
            return null;
        head.next = traverse(head.next);
        if (head.val < max)
            return head.next;
        else {
            max = head.val;
            return head;
        }
        
    }
    public ListNode removeNodes(ListNode head) {
        max = 0;
        return traverse(head);
    }
}