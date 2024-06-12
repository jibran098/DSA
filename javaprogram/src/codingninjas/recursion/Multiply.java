package codingninjas.recursion;

public class Multiply {
    public static void main(String[] args) {
        int output = Multiply(5);
        System.out.println(output);
    }
    public static int Multiply(int element) {
        //base case
        if(element == 1){
            return 1;
        }
        int output = element * Multiply(element-1);
        return output;
    }

}
