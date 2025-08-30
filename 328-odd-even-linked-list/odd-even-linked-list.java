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

        ListNode Odd = new ListNode(0);
        ListNode tempOdd = Odd;
        ListNode Even = new ListNode(0);
        ListNode tempEven = Even;

        ListNode temp = head;

        while(temp!=null){
            tempOdd.next=new ListNode(temp.val);
            tempOdd = tempOdd.next;
            temp=temp.next;

            if(temp!=null){
                tempEven.next=new ListNode(temp.val);
                tempEven = tempEven.next;
                temp= temp.next;
            }
        }
        tempOdd.next=Even.next;
        return Odd.next;
    }
}