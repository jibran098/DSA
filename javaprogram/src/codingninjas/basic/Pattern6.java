package codingninjas.basic;

public class Pattern6 {

    private static void pattern1(int numOfRows) {
        int star = numOfRows/2 + 1;
        int space = 1;
        for(int i=1; i<=numOfRows; i++) {
            for(int j=1; j<=star; j++){
                System.out.print("*  ");
            }
            for(int j=1; j<=space; j++){
                System.out.print("   ");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*  ");
            }
            if(i<=numOfRows/2) {
                star--;
                space+=2;
            } else{
                star++;
                space-=2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(5);
    }
}
