class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0;
        int count = 0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=val){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            else{
                continue;
            }
        }
        for(int k=0;k<nums.length;k++){
            if(nums[k]==val){
                count++;
            }
        }
        if(count>0){
            return nums.length-count;
        }
        else{
            return nums.length;
        }
    }
}