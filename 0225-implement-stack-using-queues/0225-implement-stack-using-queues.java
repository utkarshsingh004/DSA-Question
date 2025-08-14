class MyStack {

    private Queue<Integer> q1 = new LinkedList<>();
    
    public void push(int x) {
        if(q1.size()==0){
            q1.add(x);
        }
        else{
            q1.add(x);
            for(int i=0;i<q1.size()-1;i++){
                q1.add(q1.remove());
            }
        }
    }
    
    public int pop() {
       int peek=q1.remove();
       return peek;
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        if(q1.size()==0){
            return true;
        }
        return false;
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