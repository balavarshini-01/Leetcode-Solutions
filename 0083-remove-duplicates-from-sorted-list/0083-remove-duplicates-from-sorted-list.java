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
    public ListNode deleteDuplicates(ListNode head) {

        ListNode cur=head;
        while(cur!=null && cur.next!=null  ){
            if(cur.val!=cur.next.val){
                
                  cur=cur.next;
            }
            else{
              cur.next=cur.next.next;
                
            }
           
           
        }
        return head;
    }
}