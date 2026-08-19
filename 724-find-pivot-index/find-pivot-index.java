class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        right = sum-left-nums[0];
        if(left==right){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            left+=nums[i-1];
            right = sum-left-nums[i];
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}