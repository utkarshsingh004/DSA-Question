class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<m;i++){
            boolean flag=false;
            for(int j=i;j<m;j++){
                if(nums2[i]<nums2[j]){
                    h.put(nums2[i],nums2[j]);
                    flag=true;
                    break;
                }
            }
            if(!flag) h.put(nums2[i],-1);
        }
        for(int i:h.keySet()) System.out.println(i+" "+h.get(i));
        for(int i=0;i<n;i++){
            if(h.containsKey(nums1[i])){
                nums1[i]=h.get(nums1[i]);
            } 
        }
        return nums1;
    }
}