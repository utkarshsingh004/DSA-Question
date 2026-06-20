class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> arr = new ArrayList<>();
        int k=n/3;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!h.containsKey(nums[i])) h.put(nums[i],1);
            else h.put(nums[i],h.get(nums[i])+1);
        }
        for(int i:h.keySet()){
            if(h.get(i)>k) arr.add(i);
        }
        return arr;
    }
}