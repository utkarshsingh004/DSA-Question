class Solution {
    private void valid(String a, int n, List<String> l){
        if(a.length()==n){
            l.add(a);
            return;
        }
        if(a.isEmpty() || a.charAt(a.length()-1)!='0'){
            valid(a+'0',n,l);
        }
        valid(a+'1',n,l);
    }
    public List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        valid("",n,l);
        return l;
    }
}