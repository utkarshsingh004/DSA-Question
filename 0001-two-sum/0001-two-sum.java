class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] ={-1};
       
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(h.containsKey(target-nums[i])){
            arr = new int[]{h.get(target-nums[i]), i};
            return arr;
           }
           else{
            h.put(nums[i],i);
           }
           
        }
        return arr;
    }
}