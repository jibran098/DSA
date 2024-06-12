package codingninjas.basic;

public class Pattern10 {
    private static void pattern1(int numOfRows) {
        int space = numOfRows/2;
        int star = 1;
        int val = 1;
        int cval;
      for(int i=1; i<=numOfRows; i++){
          for(int j=1; j<=space; j++){
              System.out.print("  ");
          }
          cval=val;
          for(int j=1; j<=star; j++){
              System.out.print(cval + " ");
              if(j<=star/2){
                  cval++;
              }else{
                  cval--;
              }
          }
          if(i<=numOfRows/2){
              val++;
              space--;
              star+=2;
          } else {
              val--;
              space++;
              star-=2;

          }
          System.out.println();
      }
    }

    public static void main(String[] args) {
        pattern1(7);
    }
}
