class Solution {
    public int[] nextGreaterElements(int[] nums) {

        int length = nums.length;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {

            result[i] = -1;

            for (int j = 1; j < length; j++) {

                int index = (i + j) % length;

                if (nums[index] > nums[i]) {
                    result[i] = nums[index];
                    break;
                }
            }
        }

        return result;
    }
}