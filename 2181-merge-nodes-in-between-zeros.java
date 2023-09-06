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
    public ListNode mergeNodes(ListNode head) {
        ListNode ptr = new ListNode(0);
        ListNode ans = ptr;
        int sum = 0;
        head = head.next;
        while (head != null) {
            if (head.val != 0) {
                sum += head.val;
            }
            else {
                ptr.next = new ListNode(sum);
                ptr = ptr.next;
                sum = 0;
            }
            head = head.next;
        }
        return ans.next;
    }
}