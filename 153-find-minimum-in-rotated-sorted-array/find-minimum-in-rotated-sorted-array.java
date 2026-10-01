class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int value = nums[0];
        while(high>=low){
            int mid = (low+high)/2;
            if(nums[mid]>nums[nums.length-1]){
                low = mid+1;

            }
            else{
                value = nums[mid];
                high = mid-1;
            }
        }
        return value;
    }
}