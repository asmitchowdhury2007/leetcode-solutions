class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] minimum_values = new int[nums.length];
        int[] maximum_values = new int[nums.length];
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for(int i=nums.length-1;i>=0;i--){
            minimum = Math.min(minimum,nums[i]);
            minimum_values[i] = minimum;
        }
        for(int i=0;i<nums.length;i++){
            maximum = Math.max(maximum,nums[i]);
            maximum_values[i] = maximum;
        }
        for(int i=0;i<nums.length;i++){
            int difference = maximum_values[i]-minimum_values[i];
            if(difference<=k){
                return i;
            }
        }
        return -1;
    }
}