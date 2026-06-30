class Solution {
    private boolean h1(String word){
        int n=word.length();
        for(int i=0;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
    private boolean h2(String word){
        int n=word.length();
        for(int i=0;i<n;i++){
            if(Character.isLowerCase(word.charAt(i))) return false;
        }
        return true;
    }
    private boolean h3(String word){
        int n=word.length();
        if(!Character.isUpperCase(word.charAt(0))) return false;
        for(int i=1;i<n;i++){
            if(Character.isUpperCase(word.charAt(i))) return false;
        }
        return true;
    }
    public boolean detectCapitalUse(String word) {
        
        return h1(word)||h2(word)||h3(word);
    }
}