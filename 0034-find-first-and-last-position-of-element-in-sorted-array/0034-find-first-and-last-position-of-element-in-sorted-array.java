class Solution {

   private int first(int[] nums, int target){
     int n = nums.length;
     int i=0;
     int j=n-1;
     int f=-1;
     while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                f=mid;
                j=mid-1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return f;
   }

   private int last(int[] nums, int target){
     int n = nums.length;
     int i=0;
     int j=n-1;
     int l=-1;
     while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==target){
                l=mid;
                i=mid+1;
            }
            else if(nums[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return l;
   }

    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0]=first(nums, target);
        arr[1]=last(nums, target);
        return arr;
    }
}