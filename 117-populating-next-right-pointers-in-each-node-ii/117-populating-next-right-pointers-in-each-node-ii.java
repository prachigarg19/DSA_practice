/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null) return null;
        lt(root);
        return root;
    }
    public void lt(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        Node nextnode=null;
        while(!q.isEmpty())
        {
            int count=q.size();
            nextnode=null;
            while(count-->0)
            {
                Node temp=q.remove();
                               
                if(temp.right!=null)
                    q.add(temp.right);
                
                if(temp.left!=null)
                    q.add(temp.left);
                
                temp.next=nextnode;
                nextnode=temp;
            }
        }
    }
}