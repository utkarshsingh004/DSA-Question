class Solution {
    public int[] separateDigits(int[] nums) {
       int n=nums.length;
       ArrayList<Integer> arr = new ArrayList<>();
       for(int i=0;i<n;i++){
        String x=""+nums[i];
        for(int j=0;j<x.length();j++){
            int num=x.charAt(j)-48;
            arr.add(num);
        }
       }
       int size=arr.size();
       int ans[]=new int[size];
       for(int i=0;i<ans.length;i++){
          ans[i]=arr.get(i);
        }
    return ans;
    }
}