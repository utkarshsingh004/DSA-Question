class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        int max = 0;
        for(int num:h){
            if(!h.contains(num-1)){
                int currentNumber=num;
                int count=1;
                while(h.contains(currentNumber+1)){
                    count++;
                    currentNumber++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}