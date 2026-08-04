class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                continue;
            }
            else{
                int numbers= nums[i+1]-nums[i]-1;
                for(int j=0;j<numbers;j++){
                    result.add(nums[i]+1+j);
                }

            }
        }
        return result;
    }
}