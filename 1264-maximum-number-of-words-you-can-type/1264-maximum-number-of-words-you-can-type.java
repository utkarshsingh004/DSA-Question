class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> h = new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            h.add(brokenLetters.charAt(i));
        }
        int count=0;
        String[] str=text.split(" ");
        int i=0;
        while(i<str.length){
            for(int j=0;j<str[i].length();j++){
                if(h.contains(str[i].charAt(j))){
                    count--;
                    break;
                }
            }
            count++;
            i++;
        }
        if(count<0) return 0;
        return count;
    }
}