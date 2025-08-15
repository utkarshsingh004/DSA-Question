class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder("");
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!st.isEmpty() && ch==s.charAt(st.peek())){
                st.pop();
            }
            else{
                st.push(i);
            }
        }
        while(st.size()!=0){
            str.append(s.charAt(st.peek()));
            st.pop();
        }
        str.reverse();
         return str.toString();
    }
}