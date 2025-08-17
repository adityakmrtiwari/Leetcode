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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        l1=rev(l1);
        l2=rev(l2);

        ListNode sumList = new ListNode(0);
        ListNode temp = sumList ;

        int carry =0;
        while(l1!=null || l2!=null || carry !=0){
            int sum = carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            
            carry = sum/10;
            sum = sum%10;
            temp.next=new ListNode(sum);
            temp=temp.next;
        }
        return rev(sumList.next);
    }
    public ListNode rev(ListNode l){
        ListNode agla = null;
        ListNode prev = null;
        ListNode curr = l;

        while(curr !=null){
            agla = curr.next;
            curr.next = prev;
            prev=curr;
            curr=agla;
        }
        return prev;
    }
}