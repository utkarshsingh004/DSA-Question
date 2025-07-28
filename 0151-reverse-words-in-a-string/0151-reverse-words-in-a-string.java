// class Solution {

//    private void swap(String[] str, int i, int j){
//    while(i<j){
//       String temp=str[i];
//       str[i]=str[j];
//       str[j]=temp;
//       i++;
//       j--;
//     }
//    }

//     public String reverseWords(String s) {
//         String ans="";
//         s=s.trim();
//         String[] str = s.split(" ");
//         int n=str.length-1;
//         swap(str,0,n);
//         for(int i=0;i<=n;i++){
//             ans+=str[i];
//             if(ans.charAt(i)!=' ' && i!=n){
//                  ans+=" ";
//             }
//         }
//         return ans;
        
//     }
// }

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        int n=s.length();
        Stack<String> st = new Stack<>();
        String str ="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                st.push(str);
                str="";
            }
            else{
                str+=s.charAt(i);
            }
        }
        st.push(str);
        String result="";
        while(st.size()!=1){
            if(st.peek()==""){
                st.pop();
            }
           else{
            result+=st.pop();
            result+=" ";
           }
        }
        result+=st.pop();
        return result;
    }
}