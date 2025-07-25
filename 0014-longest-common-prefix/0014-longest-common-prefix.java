class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int min=Integer.MAX_VALUE;
        int n=strs.length;
        for(int i=0;i<n;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        for(int i=0;i<min;i++){
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)){
                   return ans;
                }
            }
            ans+=strs[0].charAt(i);
        }
        return ans;
    }
}