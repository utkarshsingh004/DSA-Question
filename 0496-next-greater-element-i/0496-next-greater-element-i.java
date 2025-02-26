class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int result[]=new int[n2];
        int k=0;
        Stack<Integer> s = new Stack<>();
        for(int i=n2-1;i>=0;i--){
            while(!s.isEmpty() && nums2[i]>=s.peek()){
                s.pop();
            }
            result[i]=s.isEmpty()?-1:s.peek();
            s.push(nums2[i]);
        }
          int[] ans = new int[n1];
        for (int i = 0; i < n1; i++) {
            ans[i] = -1; // Default to -1
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = result[j];
                    break;
                }
            }
        }
        
        return ans;
    }
}