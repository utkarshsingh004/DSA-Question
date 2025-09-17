class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
       Arrays.sort(nums);
       ArrayList<Integer> a=new ArrayList<>();
       a.add(nums[nums.length-1]);
       int i=1;
       for(int j=nums.length-2;j>=0;j--){
        if(i==k) break;
        if(nums[j]!=nums[j+1]){
          a.add(nums[j]);
            i++;
           }
       } 
       int arr[]=new int[a.size()];
       for(i=0;i<a.size();i++){
        arr[i]=a.get(i);
       }
       return arr;
    }
}