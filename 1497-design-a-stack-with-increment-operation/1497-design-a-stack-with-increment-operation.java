class CustomStack {
    private Stack<Integer> stk=new Stack<>();
    private int maxSize;
    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
    }
    
    public void push(int x) {
        if(maxSize>stk.size()){
            stk.push(x);
        }
    }
    
    public int pop() {
        if(stk.isEmpty()){
            return -1;
        }
        else{
            int ele=stk.pop();
            return ele;
        }
    }
    
    public void increment(int k, int val) {
        int size=stk.size();
        int limit=Math.min(size,k);

        for(int i=0;i<limit;i++){
            stk.set(i,stk.get(i)+val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */