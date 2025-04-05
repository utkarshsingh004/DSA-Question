class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n-k+1];
        int l=0;

        // for(int i=0;i<n-k+1;i++){
        //     int max=Integer.MIN_VALUE;
        //     for(int j=i;j<i+k;j++){
        //         if(max<nums[j]){
        //             max=nums[j];
        //         }
        //     }
        //     arr[l++]=max;
        // }
        // return arr;

        Stack<Integer> st = new Stack<>();
        int nge[] = new int[n];
        for(int i=0;i<n;i++){
            while(st.size()!=0 && nums[st.peek()]<nums[i]){
                nge[st.peek()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size()!=0){
            nge[st.peek()]=n;
            st.pop();
        }
      int j=0;
      for(int i=0;i<n-k+1;i++){
        if(j>=i+k) j=i;
        int max=Integer.MIN_VALUE;
        while(j<i+k){
           max=nums[j];
           j=nge[j];
        }
        arr[l++]=max;
      }
      return arr;
    }
}