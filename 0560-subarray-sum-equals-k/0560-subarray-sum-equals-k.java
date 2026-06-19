class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer, Integer> h= new HashMap<>();
        h.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int res=sum-k;
            if(h.containsKey(res)) count+=h.get(res);
            if(!h.containsKey(sum)) h.put(sum,1);
            else{
                h.put(sum,h.get(sum)+1);
            }
        }
        return count;
    }
}