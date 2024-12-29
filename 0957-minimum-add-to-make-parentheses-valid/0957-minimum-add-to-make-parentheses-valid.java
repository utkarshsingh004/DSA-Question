class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        int size=0;
        Stack st = new Stack();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){ 
                st.push(s.charAt(i));
                }
            else {
                if(st.empty()){
                size++;
                }
                else{
                    st.pop();
                }
            }
        }
        return st.size()+size;
    }
}