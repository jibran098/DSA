package codingninjas.basic;

public class Pattern8 {
    private static void pattern1(int numOfRows) {
        int offset = 0;
        for(int i=1; i<=numOfRows; i++) {
            for(int j=1; j<=numOfRows; j++) {
                if(j==(numOfRows/2+1)+offset || j==(numOfRows/2+1)-offset) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            if(i<=numOfRows/2) {
                offset++;
            } else {
                offset--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
