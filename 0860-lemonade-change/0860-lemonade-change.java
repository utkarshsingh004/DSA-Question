class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        if(bills[0]!=5){
            return false;
        }
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(5,0);
        h.put(10,0);
        for(int i=0;i<n;i++){
            if(bills[i]==5){
                h.put(5,h.get(5)+1);
            }
            else if(bills[i]==10){
                if(h.get(5)==0){
                    return false;
                }
                else{
                    h.put(10,h.get(10)+1);
                    h.put(5,h.get(5)-1);
                }
            }
            else {
                if(h.get(5)==0){
                    return false;
                }
                else if(h.get(10)==0){
                    if(h.get(5)<3){
                        return false;
                    }
                    else{
                        h.put(5,h.get(5)-3);
                    }
                }
                else{
                    h.put(5,h.get(5)-1);
                    h.put(10,h.get(10)-1);
                }
            }

        }
        return true;
    }
}