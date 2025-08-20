class Solution {

    private int[] parse(String s){
        int coeff=0;
        int cons=0;
        int i=0;
        while(i<s.length()){
            int sign=1;
            if(s.charAt(i)=='+'){
             sign=1;
             i++;
            }
            else if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }
            int num=0;
            boolean hasNum=false;
            while(i<s.length() && Character.isDigit(s.charAt(i))){
                num=num*10+(s.charAt(i)-'0');
                hasNum=true;
                i++;
            }
            if(i<s.length() && s.charAt(i)=='x'){
                if(!hasNum) num=1;
                coeff+=sign*num;
                i++;
            }
            else{
                cons+=num*sign;
            }
        }
        return new int[]{coeff, cons};
    }

    public String solveEquation(String equation) {
        String s[] = equation.split("=");
        int left[] = parse(s[0]);
        int right[] = parse(s[1]);
        int coeff=left[0]-right[0];
        int cons=right[1]-left[1];
        if(coeff==0){
            if(cons==0){
              return "Infinite solutions";
            }
            else return "No solution";
        }
        return "x="+cons/coeff;
    }
}