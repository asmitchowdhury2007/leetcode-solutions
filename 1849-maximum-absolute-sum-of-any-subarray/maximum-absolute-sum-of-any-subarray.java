class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_ending = nums[0];
        int min_ending = nums[0];
        int result = Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            int choice1 = max_ending+nums[i];
            int choice2 = min_ending + nums[i];
            int choice3 = nums[i];
            max_ending = Math.max(choice3, choice1);
            min_ending = Math.min(choice3,choice2);
            result = Math.max(result, Math.max(Math.abs(min_ending),Math.abs(max_ending)));
        }
        return result;
    }
}