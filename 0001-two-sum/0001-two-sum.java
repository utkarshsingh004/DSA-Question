class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int k=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(h.containsKey(target-nums[i])){
            arr[k++]=h.get(target-nums[i]);
            arr[k++]=i;
            return arr;
           }
           else{
            h.put(nums[i],i);
           }
           
        }
        return arr;
    }
}