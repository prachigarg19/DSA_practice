class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new PriorityQueue<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(q.isEmpty()) return -1;
        // if(q.size()==1) return q.remove();
        Queue<Integer> temp=new PriorityQueue<>();
        int count=q.size();
        while(count>1)
        {
            temp.add(q.remove());
            count--;
        }
        int val=q.remove();
        while(!temp.isEmpty())
            q.add(temp.remove());
        return val;
    }
    
    public int top() {
        if(q.isEmpty()) return -1;
        
        Queue<Integer> temp=new PriorityQueue<>();
        int count=q.size();
        while(count>1)
        {
            temp.add(q.remove());
            count--;
        }
        int val=q.peek();
        while(!temp.isEmpty())
            q.add(temp.remove());
        return val;
    }
    
    public boolean empty() {
        for(var a : q) System.out.println(a);
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */