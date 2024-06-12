package codingninjas.basic;

public class PrimeFactorization {
    public static void printAllPrimeFactors(int num) {
        //1440
        // This loop is for factors
        // (factors start from 2 and goes upto root n.)
        for(int div=2; div*div <= num; div++) {
            // it goes upto root n because all factors has
            // to before root n but in exceptional cases there can be just one root after root n.
            while(num%div == 0) {
                num = num / div;
                System.out.print(div + " ");
            }
        }
        // Now if in exceptional case, the value of div is not 1 after dividing by all prime factors.
        //This means there is one factor remaining which was not covered as it comes after root n.
        if(num != 1) {
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        printAllPrimeFactors(46);
    }
}
