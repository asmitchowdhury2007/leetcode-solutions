class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int question = sum-k;
            if(map.containsKey(question)){
                result+=map.get(question);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return result;
    }
}