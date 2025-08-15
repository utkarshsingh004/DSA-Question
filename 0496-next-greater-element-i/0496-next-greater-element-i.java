class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        Stack<Integer> s = new Stack<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=n2-1;i>=0;i--){
            while(!s.isEmpty() && nums2[i]>s.peek()){
                s.pop();
            }
            if(s.size()==0){
                h.put(nums2[i],-1);
            }
            else{
                h.put(nums2[i],s.peek());
            }
            s.push(nums2[i]);
        }
        for(int i=0;i<n1;i++){
            nums1[i]=h.get(nums1[i]);
        }
        return nums1;
    }
}