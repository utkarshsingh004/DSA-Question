class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer> h = new HashMap<>();
        int idx=1;
        for(int i=0;i<n;i++){
            if(!h.containsKey(temp[i])){
                h.put(temp[i],idx);
                idx++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=h.get(arr[i]);
        }
        return arr;
    }
}