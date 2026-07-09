class MyStack {
 
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        if(empty()) return -1;
        int s=q.size();
        for(int i=0;i<s-1;i++){
            q.add(q.remove());
        }
        return q.remove();
    }
    
    public int top() {
        if(empty()) return -1;
        int a=pop();
        q.add(a);
        return a;
    }
    
    public boolean empty() {
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