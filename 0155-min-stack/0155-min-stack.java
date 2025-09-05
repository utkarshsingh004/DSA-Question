class MinStack {
    Stack<Integer> s = new Stack<>();
    int min=Integer.MAX_VALUE;
    public void push(int val) {
        if(min>val){
            min=val;
        }
        s.push(val);
    }
    
    public void pop() {
        s.pop();
        int min2=Integer.MAX_VALUE;
        Stack<Integer> g = new Stack<>();
        while(s.size()!=0){
            if(min2>s.peek() && min2>=min){
                min2=s.peek();
            }
            g.push(s.pop());
        }
        while(g.size()!=0){
            s.push(g.pop());
        }
        min=min2;
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
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