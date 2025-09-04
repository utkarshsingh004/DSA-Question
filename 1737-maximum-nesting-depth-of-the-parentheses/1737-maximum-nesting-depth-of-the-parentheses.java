class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int max=0;
        int b=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            max=Math.max(max,b);
            if(c=='('){
                b++;
            }
            else if(c==')') b--;
        }
        return max;
    }
}