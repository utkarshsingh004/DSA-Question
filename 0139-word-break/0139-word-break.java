class Solution {
    private boolean helper(String s, int idx, HashSet<String> h, Boolean dp[]){
        if(idx>=s.length()) return true;
        if(dp[idx]!=null) return dp[idx];
        String ans="";
        for(int i=idx;i<s.length();i++){
           ans+=s.charAt(i);
           if(h.contains(ans)){
            if(helper(s,i+1,h,dp)) return dp[idx]=true;
           }
        }
        return dp[idx]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> h= new HashSet<>();
        for(String str:wordDict){
            h.add(str);
        }
        Boolean dp[]=new Boolean[s.length()];
        return helper(s,0,h,dp);
    }
}