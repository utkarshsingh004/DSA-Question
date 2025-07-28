class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int arr[]=new int [2];
        int n=grid.length;
        int sum=0;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!h.contains(grid[i][j])){
                    h.add(grid[i][j]);
                }
                else{
                    arr[0]=grid[i][j];
                }
                sum+=grid[i][j];
            }
        }
        n=n*n;
        int expectedSum=n*(n+1)/2;
        arr[1]=expectedSum+arr[0]-sum;
        return arr;
    }
}