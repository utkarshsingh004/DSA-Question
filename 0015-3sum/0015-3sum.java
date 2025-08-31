class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> s = new HashSet();
        int n=nums.length;
        // HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n-2;i++){
            HashSet<Integer> hm = new HashSet<>();
            for(int j=i+1;j<n;j++){
              int res=0-nums[i];
              if(hm.contains(res-nums[j])){
                List<Integer> temp = Arrays.asList(nums[i],nums[j],res-nums[j]);
                temp.sort(null);
                s.add(temp);
              }
              else{
                hm.add(nums[j]);
              }
              
            }
        }
        List<List<Integer>> ans =new ArrayList<>(s);
        return ans;
    }
}