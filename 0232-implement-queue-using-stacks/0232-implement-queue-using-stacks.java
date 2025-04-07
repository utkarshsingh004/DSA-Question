class MyQueue {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> gt = new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(st.size()==0){
             st.push(x);
        }
        else{
            while(st.size()!=0){
                gt.push(st.pop());
            }
            gt.push(x);
            while(gt.size()!=0){
                st.push(gt.pop());
            }
        }
    }
    
    public int pop() {
        int res = st.pop();
        return res;
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        if(st.size()==0){
            return true;
        }
        return false;
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