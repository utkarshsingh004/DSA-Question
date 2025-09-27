class Solution {
    private double area(double s, double a, double b, double c){
       double val = s * (s - a) * (s - b) * (s - c);
       if (val <= 0) return 0;
       return Math.sqrt(val);
    }
    private double distance(int x1, int x2, int y1, int y2){
        int x=x2-x1;
        int y=y2-y1;
        return Math.sqrt((Math.pow(x,2))+Math.pow(y,2));
    }
    public double largestTriangleArea(int[][] points) {
        int n=points.length;
        double max=0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    double a=distance(points[i][0],points[j][0],points[i][1],points[j][1]);
                    double b=distance(points[i][0],points[k][0],points[i][1],points[k][1]);
                    double c=distance(points[k][0],points[j][0],points[k][1],points[j][1]);
                    double s=(a+b+c)/2;
                    double ar=area(s,a,b,c);
                    max=Math.max(max,ar);
                }
            }
        }
        return max;
    }
}