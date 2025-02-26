class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> a = new Stack<>();
        String result="";
        StringBuilder ans= new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                a.push(i);
            }
            else if(ch == ')'){
              if(!a.isEmpty()){
                  a.pop();
              }
              else{
                ans.setCharAt(i,'*');
              }
            }
        }
        while(a.size()>0){
            ans.setCharAt(a.pop(),'*');
        }
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i)!='*'){
                result+=ans.charAt(i);
            }
        }
       return result;
    }
}