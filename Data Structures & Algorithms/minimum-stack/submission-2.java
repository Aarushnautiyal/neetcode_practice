class MinStack {
    private List<Integer> myList = new ArrayList<>();
    private Integer min = null; // Using Integer to handle empty cases

    public MinStack() {}

    public void push(int val) {
        myList.add(val);
        if (min == null || val < min) {
            min = val;
        }
    }

    public void pop() {
        if (myList.isEmpty()) return; // Edge case: avoid errors

        int removedVal = myList.remove(myList.size() - 1);

        // If the removed value was the minimum, recompute min
        if (removedVal == min) {
            min = null; // Reset and recalculate

            for (int num : myList) {
                if (min == null || num < min) {
                    min = num;
                }
            }
        }
    }

    public int top() {
        return myList.get(myList.size() - 1);
    }

    public Integer getMin() {
        return min; // Returns null if empty
    }
}
