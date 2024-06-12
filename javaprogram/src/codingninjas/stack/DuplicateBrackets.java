package codingninjas.stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String equation = "(a+b)+(c+d)";
        checkDuplicateBrackets(equation);
    }
    private static void checkDuplicateBrackets(String eq) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<eq.length();i++){
            if(eq.charAt(i) == ')'){
                if(stk.peek() == '(') {
                    System.out.println("TRUE");
                    return;
                }else {
                    while(stk.peek() != '(') {
                        stk.pop();
                    }
                    stk.pop();
                }
            }else {
                stk.push(eq.charAt(i));
            }
        }
        System.out.println("FALSE");
    }
}
