class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int sum=0-nums[i];
            HashSet<Integer> h = new HashSet<>();
            for(int j=i+1;j<n;j++){
              List<Integer> l =new ArrayList<>();
              if(h.contains(sum-nums[j])){
                l.add(nums[i]);
                l.add(sum-nums[j]);
                l.add(nums[j]);
                ans.add(l);
              }
              else{
                h.add(nums[j]);
              }
            }
        }
        return new ArrayList<>(ans);
    }
}