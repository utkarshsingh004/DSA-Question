class Solution {
    private void helper(int nums[], int idx, List<Integer> l, List<List<Integer>> res){
        // if(idx==nums.length){
            res.add(new ArrayList<>(l));
        // }
        for(int i=idx;i<nums.length;i++){
            if(i>idx && nums[i]==nums[i-1]) continue;
            l.add(nums[i]);
            helper(nums,i+1,l,res);
            l.remove(l.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,new ArrayList<>(),res);
        return res;
    }
}