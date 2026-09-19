class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Object[]> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(st.isEmpty()){
                st.push(new Object[]{c,1});
            }
            else{
                if((char) st.peek()[0]!=c){
                    st.push(new Object[]{c,1});
                }
                else{
                    if((int) st.peek()[1]<k-1){
                        char top =(char) st.peek()[0];
                        int count = (int) st.peek()[1];
                        st.pop();
                        st.push(new Object[]{top,count+1});

                    }
                    else{
                        st.pop();
                    }
                }
            }
        }
        String result ="";
        while(!st.isEmpty()){
            char top = (char) st.peek()[0];
            int count = (int) st.peek()[1];
            for(int i=1;i<=count;i++){
                result=result+top;
            }
            st.pop();
            
        }
        String reversed = "";
        for(int i=result.length()-1;i>=0;i--){
            reversed = reversed+result.charAt(i);
        }
        return reversed;

    }
}