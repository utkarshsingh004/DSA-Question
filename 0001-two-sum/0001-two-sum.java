class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr = new int[2];
        HashMap<Integer, Integer> h =new HashMap<>();
        for(int i=0;i<n;i++){
            int res=target-nums[i];
            if(h.containsKey(res)){
                arr[0]=h.get(res);
                arr[1]=i;
                break;
            }
            else if(!h.containsKey(nums[i])){
                h.put(nums[i],i);
            }
        }
        return arr;
    }
}