package codingninjas.basic;

public class Pattern7 {
    private static void pattern1(int numOfRows) {
        for(int i=1; i<=numOfRows; i++) {
            for(int j=1; j<=numOfRows; j++) {
                if(i == j || i+j == numOfRows+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(50);
    }
}
