class MinStack {
    class Node{
        int val;
        int m;
        Node(int val, int m){
            this.val=val;
            this.m=m;
        }
    }
    Stack<Node> s = new Stack<>();
    int min=Integer.MAX_VALUE;
    public void push(int val) {
        if(s.isEmpty()) min=Integer.MAX_VALUE;
        if(min>val){
            min=val;
        }
        Node temp=new Node(val,min);
        s.push(temp);
        System.out.print(temp.val+","+temp.m+" / ");
    }
    
    public void pop() {
        s.pop();
        if(!s.isEmpty()) min=s.peek().m;
    }
    
    public int top() {
        return s.peek().val;
    }
    
    public int getMin() {
        return s.peek().m ;
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