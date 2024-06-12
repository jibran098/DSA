package codingninjas.stack;

import java.util.Stack;

public class PostfixToInfixAndPrefix {
    public static void main(String[] args) {
        String exprn = "abc-*d/e+";
        convertPostfixToPrefixAndInfix(exprn);
    }
    private static void convertPostfixToPrefixAndInfix(String exprn){
        Stack<String> infix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        for(int i=0; i< exprn.length(); i++){
            if ((exprn.charAt(i) >= '0' && exprn.charAt(i) <= '9') || (exprn.charAt(i) >= 'A' && exprn.charAt(i) <= 'Z') ||
                    (exprn.charAt(i) >= 'a' && exprn.charAt(i) <= 'z')) {
                prefix.push(exprn.charAt(i) + "");
                infix.push(exprn.charAt(i) + "");
            } else if(exprn.charAt(i) == '+' || exprn.charAt(i) == '-' || exprn.charAt(i) == '*' || exprn.charAt(i) == '/') {
                String value2 = infix.pop();
                String value1 = infix.pop();
                String eval = "(" + value1 + exprn.charAt(i) + value2 + ")";
                infix.push(eval);
                value2 = prefix.pop();
                value1 = prefix.pop();
                prefix.push(exprn.charAt(i) + value1 + value2);
            }
        }
        System.out.println(infix.peek());
        System.out.println(prefix.peek());
    }
}
