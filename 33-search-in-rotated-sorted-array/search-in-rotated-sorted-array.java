class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int smallest_value_index = 0;
        int largest_value_index = 0;
        while(high>=low){
            int mid = (low+high)/2;
            if(nums[mid]<=nums[nums.length-1]){
                smallest_value_index = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(smallest_value_index==0){
            largest_value_index = nums.length-1;
        }
        else{
            largest_value_index = smallest_value_index-1;
        }
        if(target<=nums[nums.length-1]){
            low = smallest_value_index;
            high = nums.length-1;
            while(high>=low){
                int mid = (low+high)/2;
                if(nums[mid]<target){
                    low = mid+1;
                }
                else if(nums[mid]>target){
                    high = mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        else{
            low = 0;
            high = largest_value_index;
            while(high>=low){
                int mid = (low+high)/2;
                if(nums[mid]<target){
                    low = mid+1;
                }
                else if(nums[mid]>target){
                    high = mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}