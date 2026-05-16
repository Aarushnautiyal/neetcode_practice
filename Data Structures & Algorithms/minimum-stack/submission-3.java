class MinStack {
    List<Integer> ls = new ArrayList<>();
    Integer min = null;
    public MinStack() {
        
    }
    
    public void push(int val) {
        ls.add(val);
        updateMin(val);
    }
    
    public void pop() {
        if(ls.isEmpty())return;
        int val = ls.remove(ls.size()-1);
        if(val == min){
            min = null;
            for(int num: ls){
                updateMin(num);
            }
        }
    }
    
    public int top() {
        return ls.get(ls.size()-1);
    }
    
    public int getMin() {
        return min;
    }

    private void updateMin(int val){
        if(min==null||val<min){
            min = val;
        }
    }
}
