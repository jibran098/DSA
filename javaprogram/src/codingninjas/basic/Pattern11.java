package codingninjas.basic;

public class Pattern11 {
    private static void pattern1(int numOfRows) {
        int star = 1;
        int space = 2*numOfRows-1 - 2;
        for(int i=1; i<=numOfRows; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
        }
    }

    public static void main(String[] args) {
        pattern1(7);
    }
}
