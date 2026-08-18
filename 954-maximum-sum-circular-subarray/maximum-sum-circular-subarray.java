class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_ending = nums[0];
        int max_result = nums[0];
        int min_result = nums[0];
        int min_ending = nums[0];
        int result = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+= nums[i];
        }
        for(int i=1;i<nums.length;i++){
            int max_best_ending = max_ending;
            int min_best_ending = min_ending;
            max_ending = Math.max(max_best_ending+nums[i],nums[i]);
            max_result = Math.max(max_result,max_ending);
            min_ending = Math.min(min_best_ending+nums[i],nums[i]);
            min_result = Math.min(min_result,min_ending);
        }
        if(max_result<0){
            return max_result;
        }
        result = Math.max(result,Math.max(max_result,sum-min_result));
        return result;
    }
}