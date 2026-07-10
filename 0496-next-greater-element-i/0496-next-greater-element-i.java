class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=m-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<nums2[i]) s.pop();
            if(s.isEmpty()){
                h.put(nums2[i],-1);
            }
            else h.put(nums2[i],s.peek());
            s.push(nums2[i]);
        }
        // for(int i:h.keySet()) System.out.println(i+" "+h.get(i));
        for(int i=0;i<n;i++){
            if(h.containsKey(nums1[i])){
                nums1[i]=h.get(nums1[i]);
            } 
        }
        return nums1;
    }
}