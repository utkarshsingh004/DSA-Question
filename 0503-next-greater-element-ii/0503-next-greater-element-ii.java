class Solution {
    public int[] nextGreaterElements(int[] nums2) {
        int m=nums2.length;
        int arr[] = new int[m];
        for(int i=0;i<m;i++){
            boolean flag=false;
            for(int j=i;j<m;j++){
                if(nums2[i]<nums2[j]){
                    arr[i]=nums2[j];
                    flag=true;
                    break;
                }
            }
            for(int j=0;!flag && j<i;j++){
                if(nums2[i]<nums2[j]){
                    arr[i]=nums2[j];
                    flag=true;
                    break;
                }
            }
            if(!flag) arr[i]=-1;
        }
        return arr;
    }
}