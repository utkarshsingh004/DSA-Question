class Solution {
    public int maxPower(String s) {
        int n=s.length();
        if(n==1 || n==0){
            return n;
        }
        int count=1;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}