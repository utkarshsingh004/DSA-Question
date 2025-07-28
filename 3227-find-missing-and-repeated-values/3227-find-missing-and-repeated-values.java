class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int [2];
        int k=0;
        int n=grid.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!h.contains(grid[i][j])){
                    h.add(grid[i][j]);
                }
                else{
                    arr[k++]=grid[i][j];
                }
            }
        }
        int s=n*n;
        for(int i=1;i<=s;i++){
           if(!h.contains(i)){
            arr[k++]=i;
           }
        }
        return arr;
    }
}