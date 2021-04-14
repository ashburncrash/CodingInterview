class MyQueue {
    // queue is first in first out
    // stack is first in last out
    
    Stack<Integer> stackNewestTop; // original stack 
    Stack<Integer> stackOldestTop; // reverse of newesttop stack
    
    /** Initialize your data structure here. */
    public MyQueue() {
        stackNewestTop = new Stack<Integer>();
        stackOldestTop = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stackNewestTop.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        // we will move the elements from newest to oldest only if oldest stack is empty - we won't move the elements back every time.
        moveStack();
        // otherwise, remove from the oldest
        return stackOldestTop.pop();
    }
    
    /** Get the front element. */
    public int peek() {
        // we will move the elements from newest to oldest only if oldest stack is empty
        moveStack();
        // otherwise, peek from oldest stack
        return stackOldestTop.peek();
    }
    
    private void moveStack() {
     if (stackOldestTop.isEmpty()) {
        while (!stackNewestTop.isEmpty()) {
            stackOldestTop.push(stackNewestTop.pop());
        }
    }
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackNewestTop.isEmpty() && stackOldestTop.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */