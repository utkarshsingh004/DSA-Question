class Solution {
    private void helper(int idx,int k, int n, List<Integer> l, List<List<Integer>> res){
        if(l.size()==k && n==0){
            res.add(new ArrayList<>(l));
            return;
        }
       for(int i=idx;i<10;i++){
        if(idx>n || k<=0) break;
         l.add(i);
         helper(i+1,k,n-i,l,res);
         l.remove(l.size()-1);
       }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        helper(1,k,n,new ArrayList<>(),res);
        return res;
    }
}