class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        for(int i : h.keySet()){
            if(h.get(i)>1){
                return true;
            }
        }
        return false;
    }
}