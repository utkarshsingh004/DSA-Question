class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]= new int[2];
        int n=nums.length;
        HashMap<Integer, Integer> h= new HashMap<>();
        h.put(nums[0],0);
        for(int i=1;i<n;i++){
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