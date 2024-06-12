package codingninjas.basic;

public class Pattern3 {

    private static void pattern1(int numOfRows) {
        for(int i=numOfRows; i>=1; i--) {
            for(int j=1; j<=numOfRows; j++){
                if(j <= i-1){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
