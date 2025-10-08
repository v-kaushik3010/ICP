import java.util.Stack;

public class EvaluateReversePolishNotation_150 {

    public static void main(String[] args) {
        EvaluateReversePolishNotation_150 obj = new EvaluateReversePolishNotation_150();
        String[] tokens = {"2","1","+","3","*"};
        System.out.println(obj.evalRPN(tokens));
    }
    
     public int evalRPN(String[] tokens) {
        
        Stack<Integer> stack =  new Stack<>();

        for(String c: tokens){
            if(c.equals("+")){
                stack.push(stack.pop()+ stack.pop());
            }
            else if(c.equals("-")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            }
            else if(c.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(c.equals("/")){
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first/second);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.peek();
    }
}
