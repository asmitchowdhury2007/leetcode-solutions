class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<length;i++){
            if(s.charAt(i) == '(' || s.charAt(i)=='{'|| s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'|| s.charAt(i)=='}'|| s.charAt(i)==']'){
                if(st.isEmpty()){
                    return false;
                }
                else{
                    if(s.charAt(i)==')' && st.peek()=='('){
                        st.pop();
                    }
                    else if(s.charAt(i)=='}' && st.peek()=='{'){
                        st.pop();
                    }
                    else if(s.charAt(i)==']' && st.peek()=='['){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}