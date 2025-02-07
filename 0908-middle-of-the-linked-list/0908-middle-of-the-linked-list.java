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
    public ListNode middleNode(ListNode head) {
        ListNode temp=head;
        int c=0;
        while(temp!=null){
            c=c+1;
            temp=temp.next;
        }
        int mid=(c/2);
        int co=0;
        ListNode tem=head;
        while(co<mid){
            tem=tem.next;
            co++;
        }
        return tem;
    }
}