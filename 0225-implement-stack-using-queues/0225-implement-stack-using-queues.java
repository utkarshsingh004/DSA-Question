class MyStack {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        if(empty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int peek=q1.remove();
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
        return peek;
    }
    
    public int top() {
        if(empty()){
            return -1;
        }
        while(q1.size()!=1){
            q2.add(q1.remove());
        }
        int peek=q1.remove();
        q2.add(peek);
        while(q2.size()!=0){
            q1.add(q2.remove());
        }
        return peek;
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