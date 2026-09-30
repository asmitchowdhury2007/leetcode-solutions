class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int min_index = Integer.MAX_VALUE;
        int max_index = Integer.MIN_VALUE;
        int[] result = new int[2];
        while(high>=low){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                min_index = Math.min(min_index,mid);
                high=mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        low=0;
        high=nums.length-1;
        while(high>=low){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                max_index = Math.max(max_index,mid);
                low=mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(min_index==Integer.MAX_VALUE && max_index==Integer.MIN_VALUE){
            result[0]=-1;
            result[1]=-1;
            
        }
        else{
            result[0]=min_index;
            result[1]=max_index;
            
        }
        return result;
    }
}