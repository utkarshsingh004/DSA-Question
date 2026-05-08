class Solution {
    public int longestSquareStreak(int[] nums) {
        int n=nums.length;
         HashSet<Long> h = new HashSet<>();

        for (int i : nums) {
            h.add((long) i);
        }
        int max=1;
        for(long i:h){
          int count=1;
          long curr = i;

        while (h.contains(curr * curr)) {
            count++;
            curr = curr * curr;
        }
          max=Math.max(max,count);
        }
          return max == 1 ? -1 : max;
    }
}