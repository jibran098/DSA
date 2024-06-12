package codingninjas.stack;

import java.util.Stack;

public class InfixEvaluation {
    public static void main(String[] args) {
        String exprn = "2+(5-3*6/2)";
        evaluateInfixExprn(exprn);
    }

    private static void evaluateInfixExprn(String exprn) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0; i < exprn.length(); i++) {
            if (Character.isDigit(exprn.charAt(i))) {
                operands.push(exprn.charAt(i) - '0'); // '5' - '0' = 5 -> int
            } else if (exprn.charAt(i) == '(') {
                operators.push(exprn.charAt(i));
            } else if (exprn.charAt(i) == ')') {
                while (operators.size() > 0 && operators.peek() != '(') {
                    char operator = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int result = operation(value1, value2, operator);
                    operands.push(result);
                }
                operators.pop();
            } else if (exprn.charAt(i) == '+' || exprn.charAt(i) == '-' || exprn.charAt(i) == '*' || exprn.charAt(i) == '/') {
                while (operators.size() > 0 && operators.peek() != '(' && precedence(operators.peek()) >= precedence(exprn.charAt(i))) {
                    char operator = operators.pop();
                    int value2 = operands.pop();
                    int value1 = operands.pop();
                    int result = operation(value1, value2, operator);
                    operands.push(result);
                }
                operators.push(exprn.charAt(i));
            }
        }
        while (operators.size() > 0) {
            char operator = operators.pop();
            int value2 = operands.pop();
            int value1 = operands.pop();
            int result = operation(value1, value2, operator);
            operands.push(result);
        }
        System.out.println(operands.peek());
    }

    private static int operation(int value1, int value2, char operator) {
        switch (operator) {
            case '+':
                return value1 + value2;
            case '-':
                return value1 - value2;
            case '*':
                return value1 * value2;
            case '/':
                return value1 / value2;
            default:
                return -1;

        }
    }

    private static int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        }
        if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }
}
