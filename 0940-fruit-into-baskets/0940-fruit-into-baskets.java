class Solution {
    public int totalFruit(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int n=nums.length;
        int l=0;
        int r=0;
        int max=0;
        while(r<n){
            if(!h.containsKey(nums[r])){
                h.put(nums[r],1);
            }
            else{
                h.put(nums[r],h.get(nums[r])+1);
            }
            while(h.size()>2){
                h.put(nums[l],h.get(nums[l])-1);
                if(h.get(nums[l])==0) h.remove(nums[l]);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}