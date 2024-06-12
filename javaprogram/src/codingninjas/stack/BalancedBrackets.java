package codingninjas.stack;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String equation = "a+b";
        boolean result = checkBalanceBrackets(equation);
        System.out.println(result);
    }

    public static boolean checkBalanceBrackets(String eq) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < eq.length(); i++) {
            if (eq.charAt(i) == '(' || eq.charAt(i) == '[' || eq.charAt(i) == '{') {
                stk.push(eq.charAt(i));
            } else if (eq.charAt(i) == ')') {
               if(bracketMatcher(stk,'(')) {
                   stk.pop();
               } else {
                   return false;
               }
            } else if (eq.charAt(i) == ']') {
                if(bracketMatcher(stk,'[')) {
                    stk.pop();
                }
                return false;
            } else if (eq.charAt(i) == '}') {
                if(bracketMatcher(stk,'{')) {
                    stk.pop();
                }
                return false;
            }
        }
        if(!stk.isEmpty()) {
            return false;
        }
        return true;
    }
    private static boolean bracketMatcher( Stack<Character> stk ,Character ch) {
        if(!stk.isEmpty() && stk.peek().equals(ch)) {
            return true;
        }
        return false;
    }
}
