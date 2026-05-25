class Solution {
    public int passwordStrength(String password) {
        int n=password.length();
        HashMap<Character,Integer> h =new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=password.charAt(i);
            int ascii = (int) ch;
            if(!h.containsKey(ch)){
                h.put(ch,ascii);
            }
        }
        int count=0;
        for(char c:h.keySet()){
            if(h.get(c)>= 97 && h.get(c)<=122){
                count=count+1;
            }
            if(h.get(c)>= 65 && h.get(c)<=90){
                count=count+2;
            }
            if(h.get(c)>= 48 && h.get(c)<=57){
                count=count+3;
            }
            if(h.get(c)== 33 || h.get(c)==64 || h.get(c)==35 || h.get(c)==36){
                count=count+5;
            }
        }
        return count;
    }
}