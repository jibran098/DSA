package codingninjas.basic;

public class Pattern2 {

    private static void pattern1(int numOfRows) {
        for(int i=numOfRows; i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
