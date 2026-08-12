class Solution {
    public int maxProduct(int[] nums) {
        int i = 0;
        int max_ending = nums[i];
        int min_ending = nums[i];
        int answer = nums[i];
        for(i=1;i<nums.length;i++){
            int choice1 = max_ending*nums[i];
            int choice2 = min_ending*nums[i];
            int choice3 = nums[i];
            max_ending = Math.max(choice3, Math.max(choice1,choice2));
            min_ending = Math.min(choice3, Math.min(choice1,choice2));
            answer = Math.max(answer,max_ending);
        }
        return answer;
    }
}