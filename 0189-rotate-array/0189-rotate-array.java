class Solution {
    public void rotate(int[] nums, int K) {
        int n=nums.length;
        if(n==0 || n==1){
            return;
        }
        K=K%n;
        int arr[] = new int[n];
        int k=0;
        for(int i=n-K;i<n;i++){
            arr[k++]=nums[i];
        }
        for(int i=0;i<n-K;i++){
            arr[k++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}