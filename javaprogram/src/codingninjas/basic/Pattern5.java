package codingninjas.basic;

public class Pattern5 {

    private static void pattern1(int numOfRows) {
        int space=numOfRows/2, star = 1;
        for(int i=1; i<=numOfRows; i++) {
            for(int j=1; j<=space; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=star; j++) {
                System.out.print(" #");
            }
            // for first half decrease space by 1 and increase star by 2.
            if(i <= numOfRows/2) {
                space--;
                star+=2;
            }else
            //after first half increase space by 1 and decrease star by 2.
            {
                space++;
                star-=2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern1(49);
    }
}
