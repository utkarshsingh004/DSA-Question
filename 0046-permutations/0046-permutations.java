class Solution {
    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void per(int[] nums,int n, int idx, List<List<Integer>> l){
        if(idx>=n){
            List<Integer> l1=new ArrayList<>();
            for(int j=0;j<n;j++){
                l1.add(nums[j]);
            }
            l.add(l1);
            return;
        }
        for(int i=idx;i<n;i++){
           swap(nums,idx,i);
           per(nums,n,idx+1,l);
           swap(nums,idx,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> l = new ArrayList<>();
        per(nums,nums.length,0,l);
        return l;
    }
}