class Solution {
    public int romanToInt(String s) {
      HashMap<Character, Integer> h = new HashMap<>();
      h.put('I',1);
      h.put('V',5);
      h.put('X',10);
      h.put('L',50);
      h.put('C',100);
      h.put('D',500);
      h.put('M',1000);
      int ans=h.get(s.charAt(0));
      for(int i=1;i<s.length();i++){
        char c = s.charAt(i);
        if(h.get(c)<=h.get(s.charAt(i-1))){
            ans+=h.get(c);
        }
        else if(h.get(c)>h.get(s.charAt(i-1))){
            ans+=h.get(c)-2*(h.get(s.charAt(i-1)));
        }
      }
      return ans;
    }
}