class MinStack {

    Stack<Integer> s;
    Stack<Integer> g;
    int min;
    public MinStack() {
        s=new Stack<>();
        g=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        if(min>value) min=value;
        s.push(value);
        g.push(min);

    }
    
    public void pop() {
        s.pop();
        g.pop();
        min=Integer.MAX_VALUE;
        if(!g.isEmpty()) min=g.peek();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return g.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */