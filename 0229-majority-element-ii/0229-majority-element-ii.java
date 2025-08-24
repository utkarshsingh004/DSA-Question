class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> l=new ArrayList<>();
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<nums.length;i++){
           if(!h.containsKey(nums[i])){
            h.put(nums[i],1);
           }
           else h.put(nums[i], h.get(nums[i])+1);
        }
        int a=nums.length/3;
        for(int idx:h.keySet()){
            if(h.get(idx)>a) l.add(idx);
        }
        return l;
    }
}