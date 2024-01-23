class MinStack {
    Stack<Integer> stack;
    HashSet<Integer> HS;
   public MinStack() {
       stack = new Stack<Integer>();      
   }   
   public void push(int val) {
       stack.push(val);
   }  
   public void pop() {
       stack.pop();
   }
   
   public int top() {
       return stack.peek();     
   }
   public int getMin() {  
       Iterator<Integer> it=stack.iterator(); 
       int min=stack.peek();
       while(it.hasNext()){
           int val=it.next();
           if (val<min){
               min=val;
           }
       }
       return min;         
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