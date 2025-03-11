class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> s = new Stack<>();
        int nse[] = new int[n];
        int pse[] = new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.size()==0){
                nse[i]=n;
            }
            else{
                nse[i]=s.peek();
            }
            s.push(i);
        }
        while(s.size()!=0){
            s.pop();
        }
        for(int j=0;j<n;j++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[j]){
                s.pop();
            }
            if(s.size()==0){
                pse[j]=-1;
            }
            else{
                pse[j]=s.peek();
            }
            s.push(j);
        }
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(area,max);
        }
        return max;
    }
}