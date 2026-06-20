class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> arr = new ArrayList<>();
        int k=n/3;
        int el1=nums[0];
        int el2=Integer.MIN_VALUE;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) c1++;
            else if(nums[i]==el2) c2++;
            else if(c1==0){
                el1=nums[i];
                c1++;
            }
            else if(c2==0){
               el2=nums[i];
               c2++;
            } 
            else if(nums[i]!=el1 && nums[i]!=el2){
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1) c1++;
            if(nums[i]==el2) c2++;
        }
        if(c1>k) arr.add(el1);
        if(c2>k) arr.add(el2);
        return arr;
    }
}