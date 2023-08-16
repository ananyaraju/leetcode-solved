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
    public int findGCD(int x, int y) {
        if (y == 0)
            return x;
        return findGCD(y, x%y);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode curr = head;
        ListNode next = head.next;
        while (curr!=null && next!=null) {
            // find gcd
            int n1 = curr.val > next.val ? curr.val : next.val;
            int n2 = n1 == curr.val ? next.val : curr.val;
            int gcd = findGCD(n1, n2);
            // insert into list
            ListNode newNode = new ListNode(gcd);
            curr.next = newNode;
            newNode.next = next;
            // increment
            curr = next;
            next = next.next;
        }
        return head;
    }
}