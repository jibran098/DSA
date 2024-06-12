package codingninjas.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int result = fibonacci(5);
        System.out.println(result);
    }
    private static int fibonacci(int n) {
        if(n == 1 || n == 0) {
            System.out.print(n+",");
            return n;
        }
        int res =  fibonacci(n-1) + fibonacci(n-2);
       return res;
    }
}
