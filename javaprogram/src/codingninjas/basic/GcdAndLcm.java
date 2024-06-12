package codingninjas.basic;

public class GcdAndLcm {
    public static void findGCDLCM(int num1, int num2) {
        int orgN1 = num1, orgN2 = num2;
        //division rule
        while(num1 % num2 != 0) {   // till remainder does not become 0.

            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        int gcd = num2;
        int lcm = orgN1 * orgN2 / gcd;
        System.out.println(gcd + " " + lcm);
    }

    public static void main(String[] args) {
        findGCDLCM(24,35);
    }
}
