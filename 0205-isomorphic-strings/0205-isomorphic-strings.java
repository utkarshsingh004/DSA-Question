class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> h = new HashMap<>();
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
        for(int i=0;i<m;i++){
            Character sch = s.charAt(i);
            Character tch = t.charAt(i);
            if(h.containsKey(sch)){
                if(h.get(sch)!=tch) return false;
            }
            else if(h.containsValue(tch)) return false;
            else{
                h.put(sch,tch);
            }
        }
        return true;
    }
}