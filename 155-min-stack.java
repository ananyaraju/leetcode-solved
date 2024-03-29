class MinStack {

    Stack<Integer> st;
    Stack<Integer> min;

    public MinStack() {
        st = new Stack<Integer>(); 
        min = new Stack<Integer>();       
    }
    
    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || val<=min.peek())
            min.push(val);
    }
    
    public void pop() {
        int val = st.pop();
        if (val == min.peek())
            min.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */