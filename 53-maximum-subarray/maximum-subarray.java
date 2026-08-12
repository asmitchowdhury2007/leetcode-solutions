class Solution {
    public int maxSubArray(int[] nums) {
        int i = 0;
        int best_ending = nums[i];
        int answer = nums[i];
        for(i=1;i<nums.length;i++){
            int choice1 = best_ending + nums[i];
            int choice2 = nums[i];
            best_ending = Math.max(choice1,choice2);
            answer = Math.max(answer, best_ending);
        }
        return answer;
    }
}