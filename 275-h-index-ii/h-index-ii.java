class Solution {
    public int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;
        int result = 0;
        while(high>=low){
            int mid = (low+high)/2;
            int count = 0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]>=mid){
                    count++;
                }
            }
            if(count>=mid){
                result = mid;
                low = mid+1;
            }
            else{
                high = mid-1;

            }
            
        }
        return result;
    }
}