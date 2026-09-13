class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                result[i] = 0;
                st.push(i);
            }
            else{
                int difference = st.peek()-i;
                st.push(i);
                result[i] = difference;
            }
        }
        return result;
    }
}