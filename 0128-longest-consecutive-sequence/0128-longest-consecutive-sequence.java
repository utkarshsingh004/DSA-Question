class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
           if(!h.contains(nums[i])){
            h.add(nums[i]);
           }
        }
        int max=0;
        for(int i:h){
            if(!h.contains(i-1)){
                int count=1;
                int x=i;
                while(h.contains(i+1)){
                    i++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
       
        return max;
    }
}