class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();
      
        for(int i=0;i<numRows;i++){
            List<Integer> a = new  ArrayList<>();
            for(int j=0;j<=i;j++){
              if(j==0 || j==i){
                a.add(1);
              }
              else{
                int val=l.get(i-1).get(j)+l.get(i-1).get(j-1);
                a.add(val);
              }
            }
            l.add(a);
        }
        return l;
    }
}