class Solution {
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        for(int i=0;i<n1;i++){
            int k=0;
            char ch=haystack.charAt(i);
            if(ch==needle.charAt(k)){
                int j=i;
                boolean flag=true;
                while(k<n2 && j<n1){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        flag=false;
                       break;
                    }
                    j++;
                    k++;   
                }
                if(flag && k==n2){
                    return i;
                }
            }
        }
        return -1;
    }
}