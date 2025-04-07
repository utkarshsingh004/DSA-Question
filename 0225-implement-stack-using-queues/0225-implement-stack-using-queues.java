class MyStack {
    Queue<Integer> q = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        if(q.size()==0){
            q.add(x);
        }
        else{
            q.add(x);
            for(int i=0;i<q.size()-1;i++){
                q.add(q.remove());
            }
        }
    }
    
    public int pop() {
        int res = q.remove();
        return res;
    }
    
    public int top() {
       return q.peek();
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