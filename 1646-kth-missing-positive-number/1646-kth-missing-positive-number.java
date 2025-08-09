class Solution {

    private boolean find(int []arr, int num){
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==num){
                return true;
            }
            else if(arr[mid]<num){
                i=mid+1;
            }
            else j=mid-1;
        }
        return false;
    }

    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int count=0;
        for(int i=1;i<=10000;i++){
            if(find(arr,i)==false) count++;
            if(count==k) return i;
        }
        return -1;
    }
}