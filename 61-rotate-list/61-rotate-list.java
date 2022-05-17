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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null||k==0) return head;
        int size=0;
        ListNode temp = head;
        while(temp != null){
            temp=temp.next;
            size++;
        }
        if(k%size==0) return head;
        while(k>size) k-=size;
        int count=1;
        temp=head;
        while(count!=size-k){
            temp=temp.next;
            count++;
        }
        ListNode nextnode=temp.next;
        temp.next=null;
        ListNode temp2=nextnode;
        while(temp2.next!=null){
           temp2=temp2.next;
        }
        temp2.next=head;
        return nextnode;
    }
}