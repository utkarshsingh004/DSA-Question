class Solution {
    public int[] nextGreaterElements(int[] nums2) {
        int m=nums2.length;
        int arr[] = new int[m];
        // for(int i=0;i<m;i++){
        //     boolean flag=false;
        //     for(int j=1;j<m;j++){
        //         int idx=(i+j)%m;
        //         if(nums2[i]<nums2[idx]){
        //             arr[i]=nums2[idx];
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(!flag) arr[i]=-1;
        // }
        Stack<Integer> s = new Stack<>();
        for(int i=2*m-1;i>=0;i--){
            int idx=i%m;
            while(!s.isEmpty() && s.peek()<=nums2[idx]) s.pop();
            if(i<m){
                if(s.isEmpty()){
                    arr[idx]=-1;
                }
                else arr[idx]=s.peek();
            }
            s.push(nums2[idx]);
        }
        return arr;
    }
}