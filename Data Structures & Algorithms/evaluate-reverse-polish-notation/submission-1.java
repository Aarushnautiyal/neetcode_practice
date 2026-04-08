class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String[] operands = new String[]{"+","-","/","*"};
        
        for(String val : tokens){ 
            if(Arrays.asList(operands).contains(val)){
                int valOne = Integer.valueOf(s.pop());
                int valTwo = Integer.valueOf(s.pop());
                // int res =;
                // System.out.println(res);
                s.push(calculate(valOne,valTwo, val));
            }else{
                s.push(Integer.valueOf(val));
            }

        }
        return s.peek();
    }
    public int calculate(int valOne, int valTwo,String operand){
        switch(operand){
            case "+":
                return valTwo + valOne;
             case "-":
                return valTwo - valOne;
             case "*":
                return valTwo * valOne;
             case "/":
                return valTwo / valOne;
        }
        return 1;
    }
}
