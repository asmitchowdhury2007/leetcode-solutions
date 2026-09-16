class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min_value = new int[nums.length];
        int[] max_value = new int[nums.length];
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            minimum = Math.min(minimum,nums[i]);
            min_value[i] = minimum;
        }
        for(int i=0;i<nums.length;i++){
            maximum = Math.max(maximum,nums[i]);
            max_value[i] = maximum;
        }
        for(int i=0;i<nums.length;i++){
            int difference = Math.abs(max_value[i]-min_value[i]);
            if(difference<=k){
                return i;
            }
        }
        return -1;
    }
}