class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int m=intervals[0].length;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<List<Integer>> arr = new ArrayList<>();
        int k=0;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            int end=intervals[i][1];

            if(arr.size()==0){
                arr.add(Arrays.asList(start,end));
                k++;
            }
            else if(start<=arr.get(k-1).get(1)){
                if(end>arr.get(k-1).get(1)){
                    arr.get(k-1).set(1,end);
                }
            }
            else{
                arr.add(Arrays.asList(start,end));
                k++;
            }
            
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr.get(i).size();j++){
                ans[i][j]=arr.get(i).get(j);
            }
        }
        return ans;
    }
}