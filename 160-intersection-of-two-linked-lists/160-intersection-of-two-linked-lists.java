/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        //finding no of extra nodes
        ListNode tempA=headA,tempB=headB;
        while(tempA!=null && tempB!=null){
            tempA=tempA.next;
            tempB=tempB.next;
        }
        
        //finding new starting point to start at equal distance from intersection
        
        ListNode newStart=tempA==null?headB:headA;
        ListNode temp=(tempA==null)?headA:headB;
        while(tempA!=null){
            newStart=newStart.next;
            tempA=tempA.next;
        }
         while(tempB!=null){
            newStart=newStart.next;
            tempB=tempB.next;
        }
        
        while(temp!=newStart){
            newStart=newStart.next;
            temp=temp.next;
        }
        return temp;
    }
}