class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;

    /** initialize your data structure here. */
    public MinStack() {
        mainStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        // if it's the first push, we'll push it to both main and min stacks
        if (mainStack.isEmpty() && minStack.isEmpty()) {
            mainStack.push(val);
            minStack.push(val);
        } else {
            if (val <= minStack.peek()) {
                minStack.push(val);
            }
            
            mainStack.push(val);
        }
        
    }
    
    public void pop() {
        // validation for empty stack?
        if (mainStack.peek().equals(minStack.peek())) {
            minStack.pop(); // if min value is removed from main stack, also remove from min stack.
        }
        
        mainStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
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