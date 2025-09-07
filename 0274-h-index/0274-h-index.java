class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int count=1;
        for(int i=n-1;i>=0;i--){
           if(citations[i]>=count) count++;
           else break;
        }
        return count-1;
    }
}