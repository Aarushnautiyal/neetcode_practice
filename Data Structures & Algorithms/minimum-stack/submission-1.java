class MinStack {
        List<Integer> myList = new ArrayList<>();
        Stack<Integer> minStack = new Stack<>(); 
    public MinStack() {

    }
    // public void push(int val) {
    //     myList.add(val);
    //     // Always push into minStack if it's the first element or val is <= current min
    //     if (minStack.isEmpty() || minStack.peek() >= val) {
    //         minStack.push(val);
    //     }
    // }
    
    public void push(int val) {
        //  System.out.println(myList+"+++"+ val+"minnn" +minStack.peek());
        myList.add(val);
       if(minStack.isEmpty()||minStack.peek()>=val){
        minStack.push(val);
       }
    }
    
        public void pop() {
        if (myList.isEmpty()) return; // Edge case: avoid IndexOutOfBounds

        int val = myList.remove(myList.size() - 1);
        // Only pop from minStack if the removed value was the minimum
        if (!minStack.isEmpty() && minStack.peek() == val) {
            minStack.pop();
        }
    }
    
    public int top() {
        System.out.println(myList);
        return myList.get(myList.size()-1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
