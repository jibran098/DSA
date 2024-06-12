package codingninjas.stack;

import java.util.Stack;

public class LargestAreaHistogram {
    public static void main(String[] args) {
        int[] arr = {9,3,6,5,3,8,7};
        int res = findLargestAreaHistogram(arr);
       System.out.print(res);
    }
    private static int findLargestAreaHistogram(int[] arr){
        //seol : smallest element next to current element on the left
        //seor : smallest element next to current element on the right
        int[] seol = new int[arr.length];
        Stack<Integer> stk = new Stack<>();
        seol[0] = -1;
        stk.push(0);
        //element smaller than current element on the left
        for(int i = 1; i<=arr.length-1; i++){
            while (!stk.isEmpty() && arr[i] < arr[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty()) {
                seol[i] = -1;
            } else{
                seol[i] = stk.peek();
            }
            stk.push(i);
        }
        //element smaller than current element on the right
        stk = new Stack<>();
        int[] seor = new int[arr.length];
        seor[arr.length-1] = arr.length;
        stk.push(arr.length-1);
        for(int i = arr.length-2; i>=0; i--){
            while (!stk.isEmpty() && arr[i] <= arr[stk.peek()]) {
                stk.pop();
            }
            if(stk.isEmpty()) {
                seor[i] = arr.length;
            } else{
                seor[i] = stk.peek();
            }
            stk.push(i);
        }
        int maxArea = 0;
       for(int i=0; i<arr.length; i++){
           //System.out.print(seol[i] + ", ");
           int width = seor[i] - seol[i] - 1; // area = width X height where height is value of array
           int area = width * arr[i];
           if(area > maxArea) {
                maxArea = area;
           }

       }
       return maxArea;
    }
}
