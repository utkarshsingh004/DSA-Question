class Solution {
    public String removeDigit(String number, char digit) {
        int n=number.length();
        String max="";
        for(int i=0;i<n;i++){
            char c = number.charAt(i);
            String newStr ="";
            if(c==digit){
                newStr = number.substring(0,i)+number.substring(i+1);
            }

            if(newStr.compareTo(max)>0){
                max=newStr;
            }
        }
        return max;
    }
}