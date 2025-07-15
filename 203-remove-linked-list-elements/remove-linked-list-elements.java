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
        ListNode newList = new ListNode(0);
        ListNode temp = head;
        ListNode temp1 =newList;
        while(temp!=null){
            if(temp.val!=val){
                temp1.next=temp;
                temp1=temp1.next; 
            }
            temp=temp.next;
        }
        temp1.next = null;
        return newList.next;
    }
}