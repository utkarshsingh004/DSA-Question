class Solution {
    private void swap(int arr[], int i, int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int K) {
        int n=nums.length;
        if(n==0 || n==1){
            return;
        }
        K=K%n;
        swap(nums, 0, n-K-1);
        swap(nums, n-K, n-1);
        swap(nums, 0, n-1);
    }
}