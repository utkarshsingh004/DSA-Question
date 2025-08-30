class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] arr = new int[2];
        HashMap<Integer, Integer> h= new HashMap<>();
        for(int i=0;i<n;i++){
            if(h.containsKey(target-nums[i])){
                arr[0]=h.get(target-nums[i]);
                arr[1]=i;
                break;
            }
            h.put(nums[i],i);
        }
        return arr;
    }
}