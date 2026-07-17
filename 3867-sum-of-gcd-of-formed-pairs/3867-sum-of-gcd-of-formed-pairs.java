class Solution {
    private int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int gcd[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            gcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(gcd);
        int i=0;
        int j=n-1;
        long sum=0;
        while(i<j){
            sum+=gcd(gcd[j],gcd[i]);
            i++;
            j--;
        }
        return sum;
    }
}