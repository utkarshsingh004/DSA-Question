class Solution {
    private void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0;
        int j=n-1;
        int m=0;
        while(m<=j){
           if(nums[m]==0){
              swap(nums,l,m);
              l++;
              m++;
           }
           else if(nums[m]==2){
            swap(nums,m,j);
            j--;
           }
           else{
            m++;
           }
        }
    }
}