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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode();
        ListNode temp=head;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                temp.next=l1;
                temp=temp.next;
                l1=l1.next;
            }else{
                temp.next=l2;
                temp=temp.next;
                l2=l2.next;
            }
        }
        ListNode other=l1!=null?l1:l2;
        while(other!=null){
            temp.next=other;
            other=other.next;
            temp=temp.next;
        }
        return head.next;
    }
}
