class Solution {
    private void helper(int nums[], int i,int k, int n, List<Integer> l, List<List<Integer>> res){
        if(l.size()==k && n==0){
            res.add(new ArrayList<>(l));
            return;
        }
        if (i >= nums.length || l.size() > k || n < 0) return;
        l.add(nums[i]);
        helper(nums,i+1,k,n-nums[i],l,res);
        l.remove(l.size()-1);
        helper(nums,i+1,k,n,l,res);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int arr[] ={1,2,3,4,5,6,7,8,9};
        List<List<Integer>> res=new ArrayList<>();
        helper(arr,0,k,n,new ArrayList<>(),res);
        return res;
    }
}