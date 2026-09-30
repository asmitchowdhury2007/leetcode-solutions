class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        int result=0;
        while(high>=low){
            int mid = (low+high)/2;
            if(arr[mid]>arr[mid+1]){
                result = mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}