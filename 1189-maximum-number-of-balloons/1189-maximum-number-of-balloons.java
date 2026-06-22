class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n'){
                if(!h.containsKey(ch)) h.put(ch,1);
                else h.put(ch,h.get(ch)+1);
            }
        }
        if(h.containsKey('l')) h.put('l',h.get('l')/2);
        if(h.containsKey('o')) h.put('o',h.get('o')/2);
        if(h.size()<5) return 0;
        int min=Integer.MAX_VALUE;
        for(Character c : h.keySet()){
          if(h.get(c)==0) return 0;
          min=Math.min(min,h.get(c)); 
        }
        return min;
    }
}