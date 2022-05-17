/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node temp=head , newhead = null , temp2=null;
        while(temp!=null)
        {
            if( temp2 == null){
                newhead= new Node(head.val);
                temp2=newhead;
            }
            else{
                temp2.next=new Node(temp.val);
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp=head; 
        temp2=newhead;
        while(temp!=null){
            Node temp3=temp.random;
            Node temp4=newhead;
            Node temp5=head;
            while(temp5!=temp3){
                temp5=temp5.next;
                temp4=temp4.next;
            }
            temp2.random=temp4;
            temp=temp.next;
            temp2=temp2.next;
        }
        return newhead;
    }
}