class Solution {
    private void sum(int nums[], int i, int k, List<Integer> l, List<List<Integer>> res){
        if(k==0){
            res.add(new ArrayList(l));
            return;
        }
        if(i==nums.length || k<0) return;
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j-1]==nums[j]) continue;
            if(nums[j]>k) break;
            l.add(nums[j]);
            sum(nums,j+1,k-nums[j],l,res);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates,0,target,new ArrayList<>(),res);
        return res;
    }
}