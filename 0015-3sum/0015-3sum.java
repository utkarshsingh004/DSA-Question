class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> s = new HashSet();
        int n=nums.length;
        Arrays.sort(nums);
        // HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n-2;i++){
            HashSet<Integer> hm = new HashSet<>();
            int j=i+1;
            int k=n-1;
            int res=0-nums[i];
            while(j<k){
                if(nums[k]+nums[j]==res){
                    List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
                    s.add(temp);
                    j++;
                    k--;
                }
                else if(nums[k]+nums[j]<res) j++;
                else k--;
            }
        }
        List<List<Integer>> ans =new ArrayList<>(s);
        return ans;
    }
}