class Solution {
    public String convert(String s, int n) {
        String arr[]=new String[n];
        Arrays.fill(arr,"");
        int i=0;
        while(i<s.length()){
            int k=0;
            while(k<n && i<s.length()){
                arr[k]+=s.charAt(i);
                k++;
                i++;
            }
            k=n-2;
            while(k>0 && i<s.length()){
                arr[k]+=s.charAt(i);
                k--;
                i++;
            }
        }
        String ans="";
        for(i=0;i<n;i++){
            ans+=arr[i];
            System.out.print(arr[i]+" ");
        }
        return ans;
    }
}