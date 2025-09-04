class Solution {
    public String reverseWords(String s) {
       StringBuilder sb = new StringBuilder();
       String st=s.trim();
       String arr[] = st.split(" ");
       for(int i=arr.length-1;i>=0;i--){
        if(arr[i]!=""){
            sb.append(arr[i]+" ");
        }
       }
       return sb.toString().trim();
    }
}