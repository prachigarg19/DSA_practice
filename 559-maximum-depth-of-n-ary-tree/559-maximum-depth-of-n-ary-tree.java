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
    public int maxDepth(Node root) {
        return count(root);
    }
    public int count(Node root)
    {
        if(root==null) return 0;
        int left=0;
        for( var a : root.children)
        {
            left=Math.max(left,count(a));
        }
        return 1+left;
    }
}