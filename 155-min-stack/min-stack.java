class MinStack {
  ArrayDeque<Integer>st;
  ArrayDeque<Integer>mnSt;
    public MinStack() {
        this.st = new ArrayDeque<>();
        this.mnSt = new ArrayDeque<>();
    }
    
    public void push(int value) {
        //Insert the value into the original stack normally
        st.push(value);

        //Insert the minimum into the minstack
        if(mnSt.isEmpty())
        {
            mnSt.push(value);
        }
        else
        {
            mnSt.push(Math.min(value,mnSt.peek()));
        }
        
    }
    
    public void pop() {
        //pop from original stack;
        st.pop();
        //pop from minStack;
        mnSt.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        //Iterate though stack elements , find mid
        return mnSt.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */