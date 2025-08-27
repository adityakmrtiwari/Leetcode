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
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }

        int k = len - n;
        if (k == 0)
            return head.next;
        temp = head;
        for (int a = 0; a < k - 1; a++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}