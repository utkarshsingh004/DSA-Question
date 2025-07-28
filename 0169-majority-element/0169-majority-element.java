class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!h.containsKey(nums[i])){
                h.put(nums[i],1);
            }
            else{
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        int max=0;
        int ans=0;
        for(Integer i : h.keySet()){
             if(max<h.get(i)){
                max=h.get(i);
                ans=i;
             }
        }
        return ans;
    }
}