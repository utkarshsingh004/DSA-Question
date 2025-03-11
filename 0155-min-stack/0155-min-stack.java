// class MinStack {

//     Stack<Integer> s = new Stack<>();
//     Stack<Integer> min = new Stack<>();

//     public MinStack() {
        
//     }
    
//     public void push(int val) {
//         if(s.size()==0){
//             min.push(val);
//         }
//         else{
//             if(min.peek()>val){
//                 min.push(val);
//             }
//             else{
//                 min.push(min.peek());
//             }
//         }
//         s.push(val);
//     }
    
//     public void pop() {
//         s.pop();
//         min.pop();
//     }
    
//     public int top() {
//        return s.peek();
//     }
    
//     public int getMin() {
//         return min.peek();
//     }
// }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

class MinStack {

    Stack<Long> s = new Stack<>();
    long min=-1;

    public MinStack() {
        
    }
    
    public void push(int val) {
        long x = (long) val;
        if(s.size()==0){
            s.push(x);
            min=x;
        }
        else{
            if(min>x){
                s.push(2*x-min);
                min=x;
            }
            else{
                s.push(x);
            }
        }
    }
    
    public void pop() {
       if(s.size()==0){
        return;
       }
       else{
        if(s.peek()<min){
            long old=(2*min)-s.peek();
            min=old;
        }
        s.pop();
       }
    }
    
    public int top() {
        long q=s.peek();
        if(s.size()==0){
            return -1;
        }
        if(q<min){
            return (int) min;
        }
        return (int) q;
    }
    
    public int getMin() {
        if(s.size()==0){
            return -1;
        }
        return (int) min;
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