class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums); 
        for(int i=0;i<n;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                int rem=-nums[i];
                if(sum==rem){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    while(j<k && nums[j]==nums[j+1]) j++;
                    while(k>j && nums[k]==nums[k-1]) k--;
                    j++;
                    k--;
                }
                else if(sum<rem){
                j++;
                }
                else{
                k--;
                }
            }
        }
        
        return res;
    }
}
