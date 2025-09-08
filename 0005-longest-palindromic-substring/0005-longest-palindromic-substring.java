class Solution {
    private boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String str=s.substring(i,j+1);
                if(palindrome(str)){
                   if(max<str.length()){
                    max=str.length();
                    ans= new StringBuilder(str);;
                   }
                } 
            }
        }
        return ans.toString();
    }
}