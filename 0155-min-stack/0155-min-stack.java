class MinStack {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> min = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(s.size()==0){
            min.push(val);
        }
        else{
            if(min.peek()>val){
                min.push(val);
            }
            else{
                min.push(min.peek());
            }
        }
        s.push(val);
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
       return s.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */