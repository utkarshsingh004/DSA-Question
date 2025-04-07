class MyStack {
    Queue<Integer> q = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    int size=0;

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.add(x);
        size++;
    }
    
    public int pop() {
        for(int i=0;i<q.size()-1;i++){
            q.add(q.remove());
        }
        int res = q.peek();
        q.remove();
        return res;
    }
    
    public int top() {
       for(int i=0;i<q.size()-1;i++){
        q.add(q.remove());
       }
       int res = q.peek();
       q.add(q.remove());
       return res;
    }
    
    public boolean empty() {
        if(q.size()!=0){
            return false;
        }
        return true;
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