class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(!h.containsKey(c)){
                h.put(c,1);
            }
            else{
                h.put(c,h.get(c)+1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char c = magazine.charAt(i);
            if(h.containsKey(c)){
                h.put(c,h.get(c)-1);
            }
        }
       
       for(char k:h.keySet()){
        if(h.get(k)>0){
            return false;
        }
       }
        return true;
    }
}