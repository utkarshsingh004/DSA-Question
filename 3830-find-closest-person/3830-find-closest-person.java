class Solution {
    public int findClosest(int x, int y, int z) {
        int p3p1=Math.abs(z-x);
        int p3p2=Math.abs(z-y);
        if(p3p1<p3p2) return 1;
        else if(p3p1>p3p2) return 2;
        return 0;
    }
}