package codingninjas.basic;

public class Pattern9 {
    private static void pattern1(int numOfRows) {
        int first = 0;
        int second = 1;
        int next;
        for (int i = 1; i <= numOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(first + " ");
                next = first + second;
                first = second;
                second = next;
            }
            System.out.println();   
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
