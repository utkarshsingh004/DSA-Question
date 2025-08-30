class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        int count1=0;
        int count2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           if(count1==0 && el2!=nums[i]){
            count1=1;
            el1=nums[i];
           }
           else if(count2==0 && el1!=nums[i]){
            count2=1;
            el2=nums[i];
           }
           else if(nums[i]==el1) count1++;
           else if(nums[i]==el2) count2++;
           else{
            count1--;
            count2--;
           }
           System.out.println(count1);
        }
        count1 = 0; count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == el1) count1++;
            if (nums[i] == el2) count2++;
        }
        
        int a=nums.length/3;
        if(count1>a) l.add(el1);
        if(count2>a)l.add(el2);
        return l;
    }
}