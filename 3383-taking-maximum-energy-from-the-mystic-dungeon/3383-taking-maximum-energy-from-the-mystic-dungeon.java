class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n=energy.length;
        for(int i=n-k-1;i>=0;i--){
            energy[i]=energy[i]+energy[i+k];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,energy[i]);
        }
        return max;
    }
}