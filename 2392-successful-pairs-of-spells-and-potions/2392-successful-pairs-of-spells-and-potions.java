class Solution {
    private int helper(int p[], int e, long s){
        int i=0;
        int j=p.length-1;
        int a=p.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if((long)p[mid]*e>=s){
                a=mid;
                j=mid-1;
            }
            else i=mid+1;
        }
        return a;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m=potions.length;
        Arrays.sort(potions);
        for(int i=0;i<spells.length;i++){
            int idx=helper(potions,spells[i],success);
            System.out.print(idx);
            spells[i]=m-idx;
        }
       return spells;
    }
}