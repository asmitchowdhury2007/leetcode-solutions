class Solution {
    public int maximumSum(int[] arr) {
        int result = arr[0];
        int no_delete = arr[0];
        int one_delete = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            int prev_no_delete = no_delete;
            int prev_one_delete = one_delete;
            no_delete = Math.max(prev_no_delete+arr[i], arr[i]);
            if(prev_one_delete == Integer.MIN_VALUE){
                one_delete = prev_no_delete;
            }
            else{
                one_delete = Math.max(prev_one_delete + arr[i], prev_no_delete);
            }
            result = Math.max(result,Math.max(no_delete,one_delete));
        }
        return result;
        
    }
}