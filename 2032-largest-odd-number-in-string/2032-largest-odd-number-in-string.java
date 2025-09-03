class Solution {
    public String largestOddNumber(String num) {
       StringBuilder s = new StringBuilder();
       int idx=-1;
       for(int i=num.length()-1;i>=0;i--){
        int n= num.charAt(i)-'0';
        if(n%2!=0){
            idx=i;
            break;
        }
       }
       if(idx==-1){
        return "";
       }
       for(int i=0;i<=idx;i++){
        s.append(num.charAt(i));
       }
       return s.toString();
    }
}