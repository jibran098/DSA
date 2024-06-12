package codingninjas.basic;

public class Pattern4 {

    private static void pattern1(int numOfRows) {
        for(int i=numOfRows; i>=1; i--) {
            for(int j=numOfRows; j>=1; j--){
                if(j > i){
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
