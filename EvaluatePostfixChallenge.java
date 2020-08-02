class EvaluatePostfixChallenge {
    public static int evaluatePostFix(String expression) {
        char[] ch = expression.toCharArray();
        Stack<Integer> s = new Stack<Integer>(expression.length());

        for(int i=0; i < expression.length(); i++){
            if(Character.isDigit(ch[i])){
                s.push(Character.getNumericValue(ch[i]));
            }
            else{
                Integer x = s.pop();
                Integer y = s.pop();

                switch(ch[i]){

                    case '+':
                        s.push(y+x);
                        break;
                    case '-':
                        s.push(y-x);
                        break;
                    case '*':
                        s.push(y*x);
                        break;
                    case '/':
                        s.push(y/x);
                        break;

                }
            }
        }
        return s.pop();
    }
}
