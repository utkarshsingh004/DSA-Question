class MyQueue {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> g = new Stack<>();
    
    public void push(int x) {
        if(s.size()==0){
            s.push(x);
        }
        else{
            while(s.size()!=0){
                g.push(s.pop());
            }
            s.push(x);
            while(g.size()!=0){
                s.push(g.pop());
            }
        }
    }
    
    public int pop() {
        return s.pop();
    }
    
    public int peek() {
        return s.peek();
    }
    
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */