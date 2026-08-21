class Solution {
    public int findMaxLength(int[] nums) {
        int result = 0;
        int zero_count = 0;
        int one_count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero_count++;
            }
            else{
                one_count++;
            }
            int diff = zero_count-one_count;
            if(diff==0){
                result = Math.max(result,i+1);
            }
            else if(map.containsKey(diff)){
                result = Math.max(result,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }
        }
        return result;
    }
}