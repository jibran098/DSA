package codingninjas.recursion;


// APPROACH 1

//public class SumOfDigits {
//
//        public static int sumOfDigits(int input){
//            //base case
//            String inputStr = Integer.toString(input);
//            if(inputStr.length() == 1) {
//                return Integer.parseInt(inputStr);
//            }
//            int sum = Integer.parseInt(inputStr.substring(0,1)) + sumOfDigits(Integer.parseInt(inputStr.substring(1)));
//            return sum;
//        }
//    public static void main(String[] args) {
//        int output = sumOfDigits(56342);
//        System.out.println(output);
//    }
//
//}

//APPROACH 2

public class SumOfDigits {

    public static int sumOfDigits(int input){
        //base case
        if(input % 10 == input) {
            return input;
        }
        return input % 10 + sumOfDigits(input/10);
    }
    public static void main(String[] args) {
        int output = sumOfDigits(1267);
        System.out.println(output);
    }

}
