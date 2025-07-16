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
    public ListNode oddEvenList(ListNode head) {
        ListNode listA = new ListNode(0);
        ListNode listB = new ListNode(0);
        ListNode temp = head;
        ListNode tempA = listA;
        ListNode tempB = listB;
        while (temp != null) {
                tempA.next = new ListNode(temp.val);
                tempA = tempA.next;
                temp = temp.next;
                if (temp != null) {
                tempB.next = new ListNode(temp.val);
                tempB = tempB.next;
                temp = temp.next;
            }
        }
        tempA.next = listB.next;
        return listA.next;
    }
}