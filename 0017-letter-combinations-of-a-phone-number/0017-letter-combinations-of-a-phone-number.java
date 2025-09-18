class Solution {
    private void helper(String digits, HashMap<Character,String> h, int idx, String ans, List<String> l){
        if(idx==digits.length()){
            if(ans.length()==0) return;
            l.add(ans);
            return;
        }
        char currentDigit=digits.charAt(idx);
        String letter=h.get(currentDigit);
        for(int i=0;i<letter.length();i++){
            helper(digits,h,idx+1,ans+letter.charAt(i),l);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> h=new HashMap<>();
        h.put('2',"abc");
        h.put('3',"def");
        h.put('4',"ghi");
        h.put('5',"jkl");
        h.put('6',"mno");
        h.put('7',"pqrs");
        h.put('8',"tuv");
        h.put('9',"wxyz");
        
        List<String> l=new ArrayList<>();
        helper(digits,h,0,"",l);
        return l;
    }
}