class SortValuesChallenge {
    public static void sortStack(Stack<Integer> stack) {
        int value;
        Stack<Integer> new_stack = new Stack<Integer>(stack.getMaxSize());
        while(!stack.isEmpty()){
            value = stack.pop();
            if(!new_stack.isEmpty() && 
            value >= new_stack.top()){
                new_stack.push(value);
            }
            else{
                while(!new_stack.isEmpty() && 
                (value < new_stack.top())){
                    stack.push(new_stack.pop());
                }
                new_stack.push(value);
            }
        }
        while(!new_stack.isEmpty()){
            stack.push(new_stack.pop());
        }
    }
}
