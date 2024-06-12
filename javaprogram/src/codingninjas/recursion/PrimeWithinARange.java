package codingninjas.recursion;

public class PrimeWithinARange {

    public static void printPrime(int start, int end) {
        for(int num=start; num<=end; num++) {
            Boolean isPrime = true;
            for(int j=2; j*j<= num; j++) {
                if(num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + " ");
            }
        }
    }


    public static void main(String[] args) {
        printPrime(5,50);
    }
}
