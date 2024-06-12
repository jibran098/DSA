package codingninjas.recursion;

public class StringToInt {

    // Return the changed string to number
    public static int Convert(String input){
        //base case
        if(input.length() <=1) {
            return Integer.parseInt(input);
        }
        int v = (int)(Integer.parseInt(input.substring(0,1)) * Math.pow(10,input.length()-1));
        return v + Convert(input.substring(1));


    }
    public static void main(String[] args) {
        int output = Convert("32981");
        System.out.println(output);
    }
}
