class Solution {
    public int majorityElement(int[] nums) {
        int i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(i<nums.length){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])> nums.length/2){
                return nums[i];
            }
            i++;
        }
        return -1;
    }
}