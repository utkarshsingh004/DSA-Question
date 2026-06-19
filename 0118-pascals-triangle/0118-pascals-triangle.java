class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++){
           int arr[] = new int[i+1];
           for(int j=0;j<arr.length;j++){
            if(j==0 || j==arr.length-1) arr[j]=1;
            else{
                arr[j]=ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
            }
           }
           List<Integer> row = new ArrayList<>();
            for (int num : arr) {
                row.add(num);
            }
            ans.add(row);
        }
        return ans;
    }
}