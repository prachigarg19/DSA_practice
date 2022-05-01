/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {   ArrayList<Integer> al=new ArrayList<>();
            int count=q.size();
            while(count-->0)
            {
                Node temp=q.remove();
                for(var a : temp.children)
                    q.add(a);
                al.add(temp.val);
            }
        ans.add(al);
        }
        
      return ans; 
    }
}