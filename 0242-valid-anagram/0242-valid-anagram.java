class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m) return false;
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,1);
            }
            else{
                h.put(ch,h.get(ch)+1);
            }
        }
        for(int i=0;i<m;i++){
            char ch=t.charAt(i);
            if(!h.containsKey(ch)){
                return false;
            }
            else{
                h.put(ch,h.get(ch)-1);
            }
        }
        for(char c: h.keySet()){
            if(h.get(c)!=0){
                return false;
            }
        }
        return true;
    }
}