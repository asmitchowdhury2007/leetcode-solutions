class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<m*k){
            return -1;
        }
        int low = bloomDay[0];
        int high = bloomDay[0];
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]>high){
                high = bloomDay[i];
            }
            if(bloomDay[i]<low){
                low = bloomDay[i];
            }
        }
        int result = -1;
        while(high>=low){
            int mid = (low+high)/2;
            int bouquet_count = 0;
            int adjacent_count = 0;
            boolean is_adjacent_included = false;
            for(int i=0;i<bloomDay.length;i++){
                if(bloomDay[i]<=mid){
                    if(is_adjacent_included==false){
                        adjacent_count++;
                        is_adjacent_included=true;
                    }
                    else{
                        adjacent_count++;
                    }
                    if(adjacent_count==k){
                        adjacent_count = 0;
                        bouquet_count++;
                    }
                }
                else{
                    is_adjacent_included=false;
                    adjacent_count = 0;
                }
            }
            if(bouquet_count>=m){
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return result;
    }
}