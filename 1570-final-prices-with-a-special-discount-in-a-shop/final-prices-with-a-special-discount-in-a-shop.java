class Solution {
    public int[] finalPrices(int[] prices) {
        int[] discount = new int[prices.length];
        int[] answer = new int[prices.length];
        Stack<Integer> st = new Stack<>();
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }
            if(st.isEmpty()){
                discount[i] = 0;
                st.push(prices[i]);
            }
            else{
                discount[i] = st.peek();
                st.push(prices[i]);
            }
        }
        for(int i=0;i<prices.length;i++){
            answer[i] = prices[i]-discount[i];
        }
        return answer;
    }
}