class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            if(!h.contains(nums[i])){
                h.add(nums[i]);
            }
            else{
                return nums[i];
            }
        }
        return -1;
    }
}