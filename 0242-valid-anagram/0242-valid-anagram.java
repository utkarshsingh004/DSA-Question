class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        Integer temp=1;
        if(m!=n){
            return false;
        }
        HashMap <Character, Integer> h = new HashMap<>();
        // HashMap <Character, Integer> h2 = new HashMap<>();
        
        //  for(int i=0;i<m;i++){
        //     char ch = s.charAt(i);
        //     if(!h.containsKey(ch)){
        //         h.put(ch,temp);
        //     }
        //     else{
        //         Integer res=h.get(ch);
        //         res++;
        //         h.put(ch,res);
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     char ch = t.charAt(i);
           
        //     if(!h2.containsKey(ch)){
        //         h2.put(ch,temp);
        //     }
        //     else{
        //         Integer res=h2.get(ch);
        //         res++;
        //         h2.put(ch,res);
        //     }
        // }
        // return h.equals(h2);

        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            if(!h.containsKey(ch)){
                h.put(ch,temp);
            }
            else{
                Integer res=h.get(ch);
                res++;
                h.put(ch,res);
            }
        }
        for(int i=0;i<n;i++){
            char ch = t.charAt(i);
            if(!h.containsKey(ch)){
                return false;
            }
            else{
                Integer res=h.get(ch);
                res--;
                h.put(ch,res);
            }
        }
         for(var key: h.keySet()){
            if(h.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}