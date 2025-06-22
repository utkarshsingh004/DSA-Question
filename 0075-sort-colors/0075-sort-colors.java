class Solution {
    
    private void swap(int arr[],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public void sortColors(int[] arr) {
        int n=arr.length;
        int l=0;
        int m=0;
        int h=n-1;
        while(m<=h){
            if(arr[m]==0){
                swap(arr,l,m);
                l++;
                m++;
            }
            else if(arr[m]==2){
                swap(arr,m,h);
                h--;
            }
            else{
                m++;
            }
        }
    }
}