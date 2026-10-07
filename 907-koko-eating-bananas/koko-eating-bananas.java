class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high=1;
        int result = -1;
        int k = Integer.MAX_VALUE;

        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){
                high = piles[i];
            }
        }
        while(high>=low){
            int mid = (low+high)/2;
            long hours = 0;
            for(int i=0;i<piles.length;i++){
                int quotient = piles[i]/mid;
                if(piles[i]%mid==0){
                    hours = hours+quotient;
                }
                else{
                    hours = hours+quotient+1;
                }

            }
            if(hours>h){
                low=mid+1;
            }
            else{
                k = Math.min(k,mid);
                high=mid-1;
            }
        }
        if(k==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return k;
        }
    }
}