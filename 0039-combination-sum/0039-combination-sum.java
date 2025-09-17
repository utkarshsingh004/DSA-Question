class Solution {
    private void sum(int nums[],int i, int k, List<Integer> l1, List<List<Integer>> l){
        if(k==0){
            l.add(new ArrayList<>(l1));
            return;
        }
        if(i==nums.length || k<0) return;
        
        l1.add(nums[i]);
        sum(nums,i,k-nums[i],l1,l);
        l1.remove(l1.size()-1);
        sum(nums,i+1,k,l1,l);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> l=new ArrayList<>();
        sum(candidates,0,target,new ArrayList<>(),l);
        return l;
    }
}