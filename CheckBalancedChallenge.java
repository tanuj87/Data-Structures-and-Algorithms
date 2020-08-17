class CheckBalancedChallenge {
    public static boolean isBalanced(String exp) {
        Stack <Character> balance = new Stack<Character>(exp.length());

        for(int i=0; i < exp.length(); i++){
            char input = exp.charAt(i);
            if(input == '{' || input == '[' || input == '('){
                balance.push(input);
            }else{
                if(!balance.isEmpty()){
                    if(
                        (((input == '}') && (balance.top() == '{')) ||
                        ((input == ']') && (balance.top() == '[')) ||
                        ((input == ')') && (balance.top() == '(')))
                    ){
                        balance.pop();
                    }                    
                    else{
                        return false;
                    }                    
                }
                else{
                    return false;
                }
            }
        }
        if(balance.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
