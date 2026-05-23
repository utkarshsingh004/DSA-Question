class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h= new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(nums[i]);
        }
        int x=0;
        int c=0;
        int max=0;
        for(int i:h){
            if(!h.contains(i-1)){
                x=i;
                c=1;
                while(h.contains(x+1)){
                    x++;
                    c++;
                }
            }
            max=Math.max(max,c);
        }
        return max;
    }
}