class Solution {
    public int maxArea(int[] heigth) {
        int n = heigth.length;
        int i=0;
        int j=n-1;
        int area=0;
        int h=0;
        while(i<j){
            int width=j-i;
            if(heigth[i]<=heigth[j]){
                h=heigth[i];
                i++;
            }
            else{
                h=heigth[j];
                j--;
            }
            area=Math.max(area,h*width);
        }
        return area;
    }
}