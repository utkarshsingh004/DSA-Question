class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int min=0;
        System.out.print(min);
        for(int i=0;i<n;i++){
            if(strs[min].length()>strs[i].length()){
                min=i;
            }
        }
        if(strs[min].length()==0){
            return "";
        }
        
        String ans="";
        for(int i=0;i<strs[min].length();i++){
            for(int j=1;j<n;j++){
               if(strs[j].charAt(i)!=strs[j-1].charAt(i)){
                return ans;
               }
            }
            ans+=strs[min].charAt(i);
        }
        return ans;
    }
}