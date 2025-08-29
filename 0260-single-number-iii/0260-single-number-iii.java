class Solution {
    public int[] singleNumber(int[] arr) {
        int num[] = new int[2];
        int n=arr.length;
        int k=0;
        int buck1=0;
        int buck2=0;
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
        }
        int a=xor&(xor-1)^xor;
        for(int i=0;i<n;i++){
            int b=arr[i]&a;
            if(b==0){
                buck2^=arr[i];
            }
            else{
                buck1^=arr[i];
            }
        }
        num[k++]=buck1;
        num[k++]=buck2;
        return num;
    }
}