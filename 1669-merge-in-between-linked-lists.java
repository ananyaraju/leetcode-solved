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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if (list1 == null)
            return null;
        ListNode curr = list1;
        while (a > 1) {
            curr = curr.next;
            a--;
        }
        ListNode end = list1;
        while (b > -1) {
            end = end.next;
            b--;
        }
        curr.next = list2;
        while (list2 != null) {
            curr = list2;
            list2 = list2.next;
        }
        curr.next = end;
        return list1;
    }
}