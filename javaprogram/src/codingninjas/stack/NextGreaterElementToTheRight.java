package codingninjas.stack;

import java.util.Stack;

public class NextGreaterElementToTheRight {
    public static void main(String[] args) {
        int[] arr = {2,8,6,5,7,3,5};
        int[] nge = printNextGreaterToRight(arr);
        for(int element : nge) {
            System.out.print(element+",");
        }

    }
    private static int[] printNextGreaterToRight(int[] arr){
        int[] nge = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        nge[arr.length-1] = -1;
        stk.push(arr[arr.length-1]);
        // pushing the last element as it has no element to the right.
        for(int i=arr.length-2; i>=0; i--){
            if(stk.peek() > arr[i]) {
                nge[i] = stk.peek();
                stk.push(arr[i]);
            } else {
                while(!stk.isEmpty() && stk.peek() < arr[i]) {
             //peek() returns EmptyStackException when there is no element.
                    stk.pop();
                }
                if(!stk.isEmpty()) {
                    nge[i] = stk.peek();
                } else {
                    nge[i] = -1;
                }
                stk.push(arr[i]);
            }
        }
        return nge;
    }
}
