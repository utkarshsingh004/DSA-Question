class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> l = new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]<min) min=arr[i]-arr[i-1];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min) l.add(Arrays.asList(arr[i-1], arr[i]));
        }
        return l;
    }
}