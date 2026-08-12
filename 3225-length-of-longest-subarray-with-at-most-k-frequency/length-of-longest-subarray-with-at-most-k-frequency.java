class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int length = 1;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(high=0;high<nums.length;high++){
            map.put(nums[high], map.getOrDefault(nums[high],0)+1);
            while(map.get(nums[high])>k){
                map.put(nums[low], map.get(nums[low])-1);
                if(map.get(nums[low])==0){
                    map.remove(nums[low]);
                }
                low++;
                length = high-low+1;

            }
            length = high-low+1;
            if(length>result){
                result = length;
            }
        }
        return result;
    }
}