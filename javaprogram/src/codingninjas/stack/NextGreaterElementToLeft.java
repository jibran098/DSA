package codingninjas.stack;

import java.util.Stack;

public class NextGreaterElementToLeft {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 3, 1, 12, 6, 8, 7};
        int[] result = nextGreaterToLeft(arr);
        for (int element : result) {
            System.out.print(element + ",");
        }
    }

    private static int[] nextGreaterToLeft(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        //ngel -> next greater element to left
        int[] ngel = new int[arr.length];
        ngel[0] = 0+1; // for first index as there are no elements on left of it.
        // push the first element in stack as it will be
        // compared with other following elements in array.
        stk.push(0);
        // Now start from second element and go until last
        for (int i = 1; i < arr.length; i++) {
            if (stk.peek() > arr[i]) {
                ngel[i] = i - stk.peek();
                stk.push(i);
            } else {
                while (!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
                    stk.pop();
                }
                if (!stk.isEmpty()) {
                    ngel[i] = i - stk.peek();
                } else {
                    ngel[i] = i+1;
                }
                stk.push(i);
            }
        }
        return ngel;
    }
}
