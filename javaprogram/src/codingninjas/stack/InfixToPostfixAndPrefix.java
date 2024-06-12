package codingninjas.stack;

import java.util.Stack;

public class InfixToPostfixAndPrefix {
    public static void main(String[] args) {
        String exprn = "a*(b-c)/d+e";
        convertToPostfixAndPrefix(exprn);
    }

    private static void convertToPostfixAndPrefix(String exprn) {
        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> operator = new Stack<>();
        for (int i = 0; i < exprn.length(); i++) {
            if ((exprn.charAt(i) >= '0' && exprn.charAt(i) <= '9') || (exprn.charAt(i) >= 'A' && exprn.charAt(i) <= 'Z') ||
                    (exprn.charAt(i) >= 'a' && exprn.charAt(i) <= 'z')) {
                prefix.push(Character.toString(exprn.charAt(i)));
                postfix.push(Character.toString(exprn.charAt(i)));
            } else if (exprn.charAt(i) == '(') {
                operator.push(Character.toString(exprn.charAt(i)));
            } else if (exprn.charAt(i) == ')') {
                while (operator.size() > 0 && !operator.peek().equals("(")) {
                    String operatr = operator.pop();
                    String value2Pre = prefix.pop();
                    String value1Pre = prefix.pop();
                    String value2Post = postfix.pop();
                    String value1Post = postfix.pop();
                    prefix.push(operatr + value1Pre + value2Pre);
                    postfix.push(value1Post + value2Post + operatr);
                }
                operator.pop();
            }else if(exprn.charAt(i) == '+' || exprn.charAt(i) == '-' || exprn.charAt(i) == '*' || exprn.charAt(i) == '/') {
                while (operator.size() > 0 && operator.peek() != "(" && precedence(operator.peek()) >= precedence(Character.toString(exprn.charAt(i)))) {
                    String operatr = operator.pop();
                    String value2Pre = prefix.pop();
                    String value1Pre = prefix.pop();
                    String value2Post = postfix.pop();
                    String value1Post = postfix.pop();
                    prefix.push(operatr + value1Pre + value2Pre);
                    postfix.push(value1Post + value2Post + operatr);
                }
                operator.push(Character.toString(exprn.charAt(i)));
            }
        }
        while (operator.size() > 0) {
            String operatr = operator.pop();
            String value2Pre = prefix.pop();
            String value1Pre = prefix.pop();
            String value2Post = postfix.pop();
            String value1Post = postfix.pop();
            prefix.push(operatr + value1Pre + value2Pre);
            postfix.push(value1Post + value2Post + operatr);
        }
        System.out.println("PREFIX: "+ prefix.peek());
        System.out.println("POSTFIX: "+ postfix.peek());
    }

    private static int precedence(String operator) {
        switch (operator){
            case "+":
            case "-":
                return 1;
            case "*":
            case "/":
                return 2;
            default:
                return 0;
        }
    }
}

