class MinStack {
    Stack<Integer> Minst;
    int currentmin;

    public MinStack() {

        this.Minst = new Stack<>();
        Minst.push(Integer.MAX_VALUE);
        currentmin = Integer.MAX_VALUE;
        
    }
    
    public void push(int val) {
        if(val<=currentmin){
            Minst.push(currentmin);
            currentmin = val;
        }
        Minst.push(val);

        
    }
    
    public void pop() {
        if(Minst.pop() == currentmin){
            currentmin = Minst.pop();
        }
        
    }
    
    public int top() {
        return Minst.peek();
        
    }
    
    public int getMin() {
        return currentmin;
        
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