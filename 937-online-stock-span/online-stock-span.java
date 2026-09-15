class StockSpanner {
    Stack<int[]> st;
    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1;
        while(!st.isEmpty() && st.peek()[0]<=price){
            span = span + st.peek()[1];
            st.pop();
        }
        int[] arr = new int[2];
        arr[0] = price;
        arr[1] = span;
        st.push(arr);
        return span;
    }
    
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */