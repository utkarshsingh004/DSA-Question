class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int rem=sum-k;
            if(h.containsKey(rem)){
                count+=h.get(rem);
            }
            if(!h.containsKey(sum)){
                h.put(sum,1);
            }
            else{
                h.put(sum,h.get(sum)+1);
            }
        }
        return count;
    }
}