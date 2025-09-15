class Solution {
    long atoi(String s, int i, long ans){
        if(ans>Integer.MAX_VALUE) return ans;
        if(i>=s.length()) return ans;
        if(i<s.length() && !Character.isDigit(s.charAt(i))) return  ans;
        int num=s.charAt(i)-'0';
        return atoi(s, i+1, ans*10+num);
    }
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0) return 0;
        int sign=1;
        int i=0;
        if(s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign=s.charAt(0)=='-'?-1:1;
            i++;
        }
        long ans=atoi(s,i,0);
        System.out.print(ans);
        if(ans>Integer.MAX_VALUE){
            return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
        }
        return (int)ans*sign;
    }
}