class Solution {
    private void generate(String a, int n, int o, int c, List<String> l){
        if(a.length()==2*n){
            l.add(a);
            return;
        }
        if(o<n){
            generate(a+'(',n,o+1,c,l);
        }
        if(c<o){
            generate(a+')',n,o,c+1,l);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        generate("",n,0,0,l);
        return l;
    }
}