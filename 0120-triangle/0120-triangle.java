class Solution {
    private int helper(List<List<Integer>> l, int i, int j,  ArrayList<ArrayList<Integer>> arr){
        if(i==l.size()-1 && i>=j) return l.get(i).get(j);
        if(i<j) return Integer.MAX_VALUE;
        if(arr.get(i).get(j)!=Integer.MIN_VALUE) return arr.get(i).get(j);
        int ans=Math.min(helper(l,i+1,j,arr),helper(l,i+1,j+1,arr))+l.get(i).get(j);
        arr.get(i).set(j,ans);
        return ans;
    }
    public int minimumTotal(List<List<Integer>> t) {
        ArrayList<ArrayList<Integer>> arr= new ArrayList<>();
        for (int i = 0; i < t.size(); i++) {
          ArrayList<Integer> temp = new ArrayList<>();
           for (int j = 0; j <= i; j++) {
            temp.add(Integer.MIN_VALUE);
          }
          arr.add(temp);
        }
        return helper(t,0,0,arr);
    }
}