class Solution {
    private void helper(int nums[], int i, List<Integer> l, List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<>(l));
            return;
        }
        helper(nums,i+1,l,result);
        l.add(nums[i]);
        helper(nums,i+1,l,result);
        l.remove(l.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(nums,0,new ArrayList<>(),res);
        return res;
    }
}