class Solution {
    static int mergeSort(int arr[], int l, int mid, int r){
        int i=l;
        int j=mid+1;
        int count=0;
        while(i<=mid && j<=r){
            if((long)arr[i]>(long)2*arr[j]){
                count+=mid-i+1;
                j++;
            }
            else{
                i++;
            }
        }
        i=l;
        j=mid+1;

        ArrayList<Integer> a = new ArrayList<>();
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                a.add(arr[i]);
                i++;
            }
            else{
                a.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            a.add(arr[i]);
            i++;
        }
        while(j<=r){
            a.add(arr[j]);
            j++;
        }
        for(i=0;i<a.size();i++){
            arr[l+i]=a.get(i);
        }
        return count;
    }
    static int merge(int arr[], int l, int r){
        int count=0;
        if(l>=r) return count;
        int mid=l+(r-l)/2;
        count+=merge(arr,l,mid);
        count+=merge(arr,mid+1,r);
        count+=mergeSort(arr,l,mid,r);
        return count;
    }
    static int reversePairs(int arr[]) {
        // Code Here
        return merge(arr,0,arr.length-1);
        
    }
}