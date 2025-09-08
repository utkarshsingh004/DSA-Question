class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            int arr[] = new int[26];
            int max=0;
            for(int j=i;j<n;j++){
                char c=s.charAt(j);
                int num=(int) c;
                arr[num-97]++;
                int min=Integer.MAX_VALUE;
                max = Math.max(max, arr[num-97]);
                for(int k=0;k<26;k++){
                    // System.out.print(arr[k]+" ");
                    if (arr[k] == 0) continue;
                    min = Math.min(min, arr[k]);
                }
                // System.out.println(max+" "+min);
                 count+=max-min;
            }
        }
        return count;
    }
}