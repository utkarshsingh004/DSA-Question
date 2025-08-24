class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> a= new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int t=0, b=n-1, l=0, r=m-1;
        int s=n*m;
        int i=0;
        while(i<s){
            for(int j=l;j<=r&&i<s;j++){
                a.add(matrix[t][j]);
                i++;
            }
            t++;
            for(int j=t;j<=b&&i<s;j++){
                a.add(matrix[j][r]);
                i++;
            }
            r--;
            for(int j=r;j>=l&&i<s;j--){
                a.add(matrix[b][j]);
                i++;
            }
            b--;
            for(int j=b;j>=t&&i<s;j--){
                a.add(matrix[j][l]);
                i++;
            }
            l++;
        }
        return a;
    }
}