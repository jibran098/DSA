package codingninjas.basic;

//Pythagoras's triplets are 3 values which satisfies pythagoras theorem.
public class PythagorasTriplets {

    private static boolean checkPythagorasTriplet(int a, int b, int c) {
        boolean isPtriplet = false;
        if(a >= b) {
            if(a >= c) {
                if(a * a == b*b + c*c){
                    isPtriplet =  true;
                }
            } else {
                if(c * c == b*b + a*a) {
                    isPtriplet =  true;
                }
            }
        } else {
            if(b >= c) {
                if(b * b == c*c + a*a) {
                    isPtriplet =  true;
                }
            }
        }
        return isPtriplet;
    }
    public static void main(String[] args) {
        float f1 = 2.0f;
        double d1 = 4.0;

        double result = f1 * d1;
        int[][]myArray = new int[3][4];
        System.out.println("Result: " + result);
    }
}
