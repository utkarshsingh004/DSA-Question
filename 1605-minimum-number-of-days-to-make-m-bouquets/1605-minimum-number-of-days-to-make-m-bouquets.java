class Solution {

    private int max(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    private int min(int arr[]){
        int m = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < m){
                m = arr[i];
            }
        }
        return m;
    }

    private int mD(int[] arr, int day, int k){
        int count = 0;
        int bouquets = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day){
                count++;
                if(count == k){
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)m * k > n) return -1; // not enough flowers

        int left = min(bloomDay);
        int right = max(bloomDay);
        int ans = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(mD(bloomDay, mid, k) >= m){
                ans = mid;
                right = mid - 1; // try smaller day
            } else {
                left = mid + 1; // need more days
            }
        }
        return ans;
    }
}
